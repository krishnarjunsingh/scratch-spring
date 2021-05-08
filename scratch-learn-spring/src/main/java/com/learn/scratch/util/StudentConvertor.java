package com.learn.scratch.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.learn.scratch.dto.StudentDTO;
import com.learn.scratch.entity.Student;

@Component
public class StudentConvertor {
	ModelMapper modelMapper = new ModelMapper();
	
	public StudentDTO entityToDTO(Student student) {
		
		StudentDTO mapDTO = modelMapper.map(student, StudentDTO.class);
		
		return mapDTO;
	}
	
	public List<StudentDTO> entityToDTO(List<Student> student){
		
		return student.stream().map(x->entityToDTO(x)).collect(Collectors.toList());
	}
	
	public Student dtoToEntity(StudentDTO studentDTO) {
		
		Student mapEntity = modelMapper.map(studentDTO, Student.class);
		
		return mapEntity;
	}
	
	public List<Student> dtoToEntity(List<StudentDTO> studentDTO){
		return studentDTO.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
	}

}
