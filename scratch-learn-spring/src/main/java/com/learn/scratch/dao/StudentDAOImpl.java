package com.learn.scratch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.scratch.entity.Student;
import com.learn.scratch.rowMapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		String sql = "select * from students";
		List<Student> listOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		return listOfStudent;
	}

	@Override
	public Student saveStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
