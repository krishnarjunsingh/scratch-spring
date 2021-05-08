package com.learn.scratch.dao;

import java.util.List;

import com.learn.scratch.entity.Student;


public interface StudentDAO {

	public List<Student> studentList();
	public Student saveStudent();
	
}
