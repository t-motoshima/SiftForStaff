package com.procast.shift.dataaccess;

import com.procast.shift.dto.UserFromItemDto;

/**
 *
 * ユーザー登録用フォームに必要な情報のためのDao
 *
 * @author takata
 *
 */
public interface RegistrationFromDao {

	/**
	 * スタッフ登録のフォームに必要な情報を取得する
	 *
	 * @return ユーザーフォーム要素
	 */
	UserFromItemDto createStaffRegistrationFrom();

	/**
	 * 管理者登録に必要な情報を取得する
	 *
	 * @return ユーザーフォーム要素
	 */
	UserFromItemDto createOwnerRegistrationFrom();

	UserFromItemDto createStaffRegistrationFrom(String staffCode) throws Exception;

}
