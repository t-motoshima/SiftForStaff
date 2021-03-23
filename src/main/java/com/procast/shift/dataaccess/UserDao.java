package com.procast.shift.dataaccess;

import java.util.List;

import com.procast.shift.entity.StaffInfo;
import com.procast.shift.entity.StaffShiftPattern;
import com.procast.shift.entity.SubWorkProcess;

/**
 * ユーザー情報を取得するDao
 *
 *ユーザー情報テーブルに関するもの
 *
 * @author takata
 *
 */
public interface UserDao {
	/**
	 * ユーザー情報を取得する。
	 *
	 * @param staffCode スタッフコード
	 * @return ユーザー情報
	 * @throws Exception
	 */
	StaffInfo getUserInfo(String staffCode) throws Exception;

	/**
	 *
	 * ユーザーの全リストを取得する
	 *
	 * @return
	 * @throws Exception
	 */
	List<StaffInfo> getUserList() throws Exception;

	/**
	*
	* 権限ごとのリストを取得する
	*
	* @return
	* @throws Exception
	*/
	List<StaffInfo> getUserList(int ownerFlag) throws Exception;

	/**
	 * スタッフのサブ工程のリストを取得する。
	 *
	 * @param staffCode
	 * @return
	 * @throws Exception
	 */
	List<SubWorkProcess> getSubProcessList(String staffCode) throws Exception;

	/**
	 * スタッフのシフトパターンを取得する。
	 *
	 * @param staffCode
	 * @return
	 * @throws Exception
	 */
	List<StaffShiftPattern> getShiftPaternList(String staffCode) throws Exception;
}
