package com.dilip.SpringDemo;

public class Student implements Person{
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("I am Student");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
