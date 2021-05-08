package com.learn.scratch.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.learn"})
public class StudentAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver(){
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver(); 
		internalResourceViewResolver.setPrefix("/WEB-INF/view/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourse());
		
		return jdbcTemplate;
		
	}
	
	DataSource dataSourse() {
		
		DriverManagerDataSource driverSourse = new DriverManagerDataSource();
		driverSourse.setUsername("root");
		driverSourse.setPassword("kakaqwe");
		driverSourse.setUrl("jdbc:mysql://localhost:3306/learnspring?useSSL=false");
		driverSourse.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		
		return driverSourse;
	}
	
}
