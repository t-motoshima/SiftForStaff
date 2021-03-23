package com.procast.shift.dataaccess.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.procast.shift.entity.StaffInfo;

@Mapper
public interface StafftInfoMapper {
	/**
	 * selectUserOne
	 *
	 * @param staff_code
	 * @return UserInfo
	 */
	StaffInfo selectUserOne(@Param("staffCode")String staffCode);

}
