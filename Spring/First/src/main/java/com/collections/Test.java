package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collections/collections.xml");
		
		Print emp=(Print)context.getBean("print");
		
		System.out.println(emp);
		
//		System.out.println(emp.getList());
//		
//		System.out.println(emp.getSet());
//		
//		System.out.println("Props "+emp.getProps());
		
	}

}
