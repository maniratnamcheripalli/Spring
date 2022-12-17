package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/setter/set.xml");
		Employee emp=(Employee)context.getBean("employee");
		
		Address ad=(Address)context.getBean("address");
		
		System.out.println(emp);
		
		System.out.println(ad);
		
	}

	

}
