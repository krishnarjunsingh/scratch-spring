package com.learn.scratch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.scratch.dto.StudentDTO;
import com.learn.scratch.entity.Student;
import com.learn.scratch.service.StudentService;
import com.learn.scratch.util.StudentConvertor;

@RestController
@RequestMapping("/api")
public class StudentAPIController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	StudentConvertor studentConvertor;
	
	@GetMapping("/studentlist")
	public List<StudentDTO> apiListStudent(){
		
		List<Student> student = studentService.studentList();
		
		return studentConvertor.entityToDTO(student);
	}

}
