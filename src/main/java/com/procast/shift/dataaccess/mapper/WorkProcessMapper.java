package com.procast.shift.dataaccess.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.procast.shift.entity.WorkProcess;

@Mapper
public interface WorkProcessMapper {
	/**
	 * selectWorkProcessOne
	 *
	 * @param
	 * @return
	 */
	WorkProcess selectWorkProcessOne(@Param("work_base_code")String work_base_code
			,@Param("process_code")String process_code
			);

	/**
	 * selectWorkProcessAll
	 *
	 * @param
	 * @return
	 */
	List<WorkProcess> selectWorkProcessAll();


	/**
	 * insertWorkProcessProcess
	 *
	 * @param
	 * @return
	 */
	void insertWorkProcessProcess(@Param("work_base_code")String work_base_code
			,@Param("process_code")String process_code
			,@Param("process_name")String process_name
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("create_date")Date create_date
			,@Param("create_user")String create_user
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			);

	/**
	 * insertWorkProcessProcess
	 *
	 * @param
	 * @return
	 */
	void updateWorkProcess(	@Param("process_name")String process_name
			,@Param("effective_date")Date effective_date
			,@Param("expire_date")Date expire_date
			,@Param("last_update_date")Date last_update_date
			,@Param("last_update_user")String last_update_user
			,@Param("work_base_code")String work_base_code
			,@Param("process_code")String process_code
			);
}
