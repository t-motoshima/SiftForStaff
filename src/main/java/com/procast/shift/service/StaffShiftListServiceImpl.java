package com.procast.shift.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procast.shift.dataaccess.StaffShiftDao;
import com.procast.shift.dataaccess.UserDao;
import com.procast.shift.dto.StaffShiftListDto;
import com.procast.shift.dto.StaffShiftMonthlyDto;
import com.procast.shift.entity.ShiftCalendar;
import com.procast.shift.entity.StaffInfo;
import com.procast.shift.entity.StaffShift;

@Service
public class StaffShiftListServiceImpl implements StaffShiftListService {

	//管理者フラグ(0=スタッフ)
	static final int STAFF_FLAG = 0;

	// ユーザー情報のDao
	@Autowired
	private UserDao userDao;
	// ユーザーシフト
	@Autowired
	private StaffShiftDao staffShiftDao;

	@Override
	public StaffShiftListDto getAllStaffShiftList() throws Exception {
		//シフト表示のDTO
		StaffShiftListDto staffShiftListDto = new StaffShiftListDto();
		staffShiftListDto.setShiftCalendarList(staffShiftDao.getShiftCalendarList());

		return staffShiftListDto;
	}

	@Override
	public StaffShiftListDto getMonthlyStaffShiftList(int month) throws Exception {
		// TODO ここの処理をなやんでいる
		//Controllerへ引き渡すDTO
		StaffShiftListDto staffShiftListDto = new StaffShiftListDto();

		//ユーザーリストを取得
		List<StaffInfo> userList = userDao.getUserList();
		//ユーザーリストを設定
		staffShiftListDto.setStaffList(userList);

		//カレンダーリストを設定
		List<ShiftCalendar> monthlyShiftCalendarList = staffShiftDao.getMonthlyShiftCalendarList(month);
		staffShiftListDto.setShiftCalendarList(monthlyShiftCalendarList);

		//スタッフシフトリストの入れ物を作成
		ArrayList<StaffShiftMonthlyDto> staffShiftDtoList = new ArrayList<StaffShiftMonthlyDto>();
		//ユーザーごとのシフトを取得
		for (StaffInfo user : userList) {
			//ユーザーごとのDTO
			StaffShiftMonthlyDto staffShiftMonthlyDto = new StaffShiftMonthlyDto();
			staffShiftMonthlyDto.setStaffCode(user.getStaffCode());
			staffShiftMonthlyDto.setStaffName(user.getStaffName());

			//表示のための丸1ヵ月分のシフト
			List<StaffShift> veiwShiftList = new ArrayList<StaffShift>();
			//ユーザーの当月シフトリスト
			List<StaffShift> monthlyShiftList = staffShiftDao.getMonthlyStaffShiftList(user.getStaffCode(), month);
			//引数用の変数
			String staffCode = null;
			Date shiftDate = null;
			String shiftPattern = null;
			String startTime = null;
			String endTime = null;
			String hour = null;
			Date loadedDate = null;

			//カレンダーの1ヶ月分の日付をループ
			for (ShiftCalendar shiftCalendar : monthlyShiftCalendarList) {
				//シフトデータのリストをループ
				for (StaffShift monthlyShift : monthlyShiftList) {
					//シフト情報の設定
					staffCode = monthlyShift.getStaffCode();
					shiftDate = monthlyShift.getShiftDate();
					startTime= monthlyShift.getStartTime();
					endTime = monthlyShift.getEndTime();
					hour = monthlyShift.getHour();
					loadedDate = monthlyShift.getLoadedDate();

					//カレンダーの日付とシフトの日付が合致するかどうか
					if (shiftCalendar.getDateYmd().equals(monthlyShift.getShiftDate())) {
						//合致したらシフトパターンを設定するbreak;
						shiftPattern = monthlyShift.getShiftPatternCode();
						break;
					} else {
						//合致しなかったら「●」を設定する
						shiftPattern = "●";
					}
				}
				//表示用のシフトリストに設定
				veiwShiftList.add(new StaffShift(staffCode, shiftDate, shiftPattern, startTime, endTime, hour, loadedDate));
			}
			//ユーザーごとのシフトDTOに追加
			staffShiftMonthlyDto.setStaffShiftList(veiwShiftList);
			//スタッフシフトリストに追加
			staffShiftDtoList.add(staffShiftMonthlyDto);
		}
		//スタッフシフトリストを設定
		staffShiftListDto.setStaffShiftMonthlyDto(staffShiftDtoList);

		return staffShiftListDto;
	}
}
