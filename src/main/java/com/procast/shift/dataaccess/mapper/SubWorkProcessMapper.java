package com.procast.shift.dataaccess.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.procast.shift.entity.SubWorkProcess;

@Mapper
public interface SubWorkProcessMapper {

	/**
	 * selectStaffSubProcess
	 *
	 * @param staff_code
	 * @return UserSubProcess
	 */
	SubWorkProcess selectStaffSubProcess(@Param("staff_code")String staff_code);

}
