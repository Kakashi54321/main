package com.dilip.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher implements Person{
	
	@Autowired
	private Human human;
	
	int salary;

	public Teacher(int salary) {
		super();
		this.salary = salary;
	}

	public void info() {
		System.out.println("I am Teacher");
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", human=" + human + "]";
	}

	public Human getStudent() {
		return human;
	}

	public void setStudent(Human human) {
		this.human = human;
	}
	
}
