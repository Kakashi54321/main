package com.dilip.SpringDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before("execution(public void show())")
	public void log() {
		System.out.println("Helper called");
	}
}
