package com.learn.scratch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.scratch.dto.StudentDTO;
import com.learn.scratch.entity.Student;
import com.learn.scratch.service.StudentService;
import com.learn.scratch.util.StudentConvertor;

@Controller
@RequestMapping("/customer")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	StudentConvertor studentConvertor;
	
	@GetMapping("/showstudent")
	public String studentList(Model model) {
		
		List<Student> studentList = studentService.studentList();
		
		List<StudentDTO> studentDTOList = studentConvertor.entityToDTO(studentList);
		model.addAttribute("studentsList", studentDTOList);
		
		return "student-list";
	}

}
