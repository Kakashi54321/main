package com.dilip.demo.dto;

public class Student {
	String name;
	int age;
	String department;
	public Student(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
