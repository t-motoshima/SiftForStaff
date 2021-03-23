package com.procast.shift.service;

import com.procast.shift.dto.LoginDto;

public interface LoginService {

	/**
	 * ログイン情報の検索
	 *
	 * 管理者フラグの有無で検査う条件を変える。
	 *
	 * @param staffCode
	 * @param passCode
	 * @param OwnerFlg
	 * @return
	 * @throws Exception
	 */
	LoginDto findStaffInfo(String staffCode, String passCode) throws Exception;

}
