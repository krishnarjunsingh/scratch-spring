package com.learn.scratch.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.scratch.dao.StudentDAO;
import com.learn.scratch.entity.Student;
import com.learn.scratch.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDao;
	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		return studentDao.studentList();
	}

	@Override
	public Student saveStudent() {
		// TODO Auto-generated method stub
		return studentDao.saveStudent();
	}

}
