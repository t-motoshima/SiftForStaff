package com.procast.shift.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
/**
 *スタッフ登録のフォーム
 *
 * @author takata
 *
 */
@Data
public class StaffRegistrationFrom {

	/** スタッフコード */
	@NotBlank(message = "スタッフコードを入力してください。")
	@Size(min = 1, max = 20)
	private String staffCode;

	/** 氏名 */
	@NotBlank(message = "氏名を入力してください。")
	private String staffName;

	/** ふりがな */
	private String staffFurigana;

	/** 入社年月日 */
	private String employmentDate;

	/** 販売者番号 */
	private String salespersonCode;

	/** パスコード */
	@NotNull(message = "パスコードを入力してください。")
	@Size(min = 1, max = 16)
	private String passCode;

	/** 有給残日数 */
	private int paidLeaveRemaing;

	/** 等級 */
	private String staffGrade;

	/** 所属 */
	private String affiliation;

	/** 拠点 */
	private String workBaseCode;

	/** メイン工程 */
	private String mainProcess;

	/** サブ工程のリスト */
	private List<String> checkedSubProcessList;

	/** シフトパターンのリスト */
	private List<String> checkedShiftPatternList;

	/** 公休日のリスト */
	private List<String> checkedHolidayList;

	/** 備考 */
	private String note;

}