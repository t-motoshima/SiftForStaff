package com.procast.shift.dataaccess.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.procast.shift.entity.WorkBase;

@Mapper
public interface WorkBaseMapper {
	/**
	 * selectWorkBaseOne
	 *
	 * @param
	 * @return
	 */
	WorkBase selectWorkBaseOne(@Param("work_base_code")String work_base_code);

	/**
	 * selectWorkBaseAll
	 *
	 * @param
	 * @return
	 */
	List<WorkBase> selectWorkBaseAll();

	/**
	 * insertWrokBase
	 *
	 * @param
	 * @return
	 */
	void insertWrokBase(@Param("work_base_code")String work_base_code
			,@Param("work_base_name")String work_base_name
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("create_date")Date create_date
			,@Param("create_user")String create_user
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			);

	/**
	 * updateWorkBase
	 *
	 * @param
	 * @return
	 */
	void updateWorkBase (
			@Param("work_base_name")String work_base_name
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			,@Param("work_base_code")String work_base_code
			);
}
