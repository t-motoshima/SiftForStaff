package com.procast.shift.dataaccess;

import com.procast.shift.entity.StaffInfo;

/**
 *
 * ユーザーログイン用のDao
 *
 * @author takata
 *
 */
public interface LoginDao {
	/**
	 *
	 * ユーザー情報をスタッフコードとパスコードの組み合わせで取得する。
	 *
	 * @param staffCode
	 * @param passCode
	 * @return
	 * @throws Exception
	 */
	StaffInfo getStaffInfoLogin(String staffCode, String passCode) throws Exception;

}
