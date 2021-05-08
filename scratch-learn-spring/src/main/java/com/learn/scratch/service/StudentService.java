package com.learn.scratch.service;

import java.util.List;

import com.learn.scratch.entity.Student;


public interface StudentService {

	public List<Student> studentList();
	public Student saveStudent();
	
}
