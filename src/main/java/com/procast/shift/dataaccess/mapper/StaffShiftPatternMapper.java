package com.procast.shift.dataaccess.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.procast.shift.entity.StaffShiftPattern;

@Mapper
public interface StaffShiftPatternMapper {
	/**
	 * selectStaffShiftPattern
	 *
	 * @param
	 * @return
	 */
	List<StaffShiftPattern> selectStaffShiftPattern(@Param("staff_code")String staff_code);


	/**
	 * selectStaffShiftPatternOne
	 *
	 * @param
	 * @return
	 */
	StaffShiftPattern selectStaffShiftPatternOne(@Param("staff_code")String staff_code
			,@Param("shift_patterm")String shift_patterm
			);

	/**
	 * insertStaffShiftPattern
	 *
	 * @param
	 * @return
	 */
	void insertStaffShiftPattern(@Param("staff_code")String staff_code
			,@Param("shift_patterm")String shift_patterm
			,@Param("start_time")String start_time
			,@Param("end_time")String end_time
			,@Param("working_time")String working_time
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("create_date")Date create_date
			,@Param("create_user")String create_user
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			);

	/**
	 * updateStaffShiftPattern
	 *
	 * @param
	 * @return
	 */
	void updateStaffShiftPattern(
			@Param("start_time")String start_time
			,@Param("end_time")String end_time
			,@Param("working_time")String working_time
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("create_date")Date create_date
			,@Param("create_user")String create_user
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			,@Param("staff_code")String staff_code
			,@Param("shift_patterm")String shift_patterm
			);

}
