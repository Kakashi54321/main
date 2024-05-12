package com.dilip.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dilip.demo.dto.Student;

@Service
public class StudentService {
	private List<Student> students = new ArrayList<>(Arrays.asList(
			new Student("Dilip", 26, "CSE"),
			new Student("Diwas", 25, "CSE"),
			new Student("Abhay", 27, "ISE")
	));
	
	public List<Student> getStudents(){
		return students;
	}
	
	public Student getStudentByName(String name){
		return students.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void updateStudent(Student student, String name){
		for(int i = 0; i < students.size(); i++) {
			Student stud = students.get(i);
			if(stud.getName().equals(name)) {
				students.set(i, student);
			}
		}
	}
	
	public void deleteStudent(String name){
//		for(int i = 0; i < students.size(); i++) {
//			Student stud = students.get(i);
//			if(stud.getName().equals(name)) {
//				students.remove(i);
//			}
//		}
		
		students.removeIf(t -> t.getName().equals(name));
	}
}
