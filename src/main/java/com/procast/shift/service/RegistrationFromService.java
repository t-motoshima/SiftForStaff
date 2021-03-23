package com.procast.shift.service;

import com.procast.shift.dto.StaffRegistrationFrom;
import com.procast.shift.dto.UserFromItemDto;

/**
 * フォーム情報取得のService
 *
 * @author takata
 *
 */
public interface RegistrationFromService {

/**
 * スタッフフォームに必要な要素を取得する
 *
 * @return
 * @throws Exception
 */
UserFromItemDto getStaffFormItem() throws Exception;

void createStaff(StaffRegistrationFrom staffRegistrationFrom) throws Exception;

/**
 * 管理者フォームに必要な要素を取得する
 *
 * @return
 * @throws Exception
 */
UserFromItemDto getOwnerFormItem() throws Exception;
}

