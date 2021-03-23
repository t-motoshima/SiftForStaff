package com.procast.shift.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatisのconfig
 *
 * @author takata
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.procast.shift.dataaccess.mapper")
public class MyBatisConfig {

	    @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
	        sessionFactoryBean.setDataSource(dataSource);

	        return sessionFactoryBean.getObject();
	    }
	}
