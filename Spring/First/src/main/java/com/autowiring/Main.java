package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiring/auto.xml");
		
		Emp em=(Emp)context.getBean("emp");
		System.out.println(em);
		
		
	}
}
