package com.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructer/constructer.xml");
		
		Person per=(Person)context.getBean("person");
		System.out.println(per);
	}

}
