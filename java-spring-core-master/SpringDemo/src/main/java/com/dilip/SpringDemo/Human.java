package com.dilip.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Human implements Person{
	public void info() {
		System.out.println("I am Human");
	}
}
