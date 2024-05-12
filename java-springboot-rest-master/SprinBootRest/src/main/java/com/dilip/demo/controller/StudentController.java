package com.dilip.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.demo.dto.Student;
import com.dilip.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{name}")
	public void updateStudent(@RequestBody Student student, @PathVariable String name) {
		studentService.updateStudent(student, name);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{name}")
	public void deleteStudent(@PathVariable String name) {
		studentService.deleteStudent(name);
	}
}
