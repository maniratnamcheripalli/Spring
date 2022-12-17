package com.jdbc2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/jdbc2/jdbc.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationExample.class);
		
		EmployeeDao bean = context.getBean("implementation",EmployeeDao.class);
		
		
		// INSERT
		
//		Employee emp=new Employee();
//		emp.setId(4);
//		emp.setName("Gopi");
//		emp.setPosition("Director");
//		emp.setCompany("Techouts");
//		
//		int insert = bean.insert(emp);
//		System.out.println(insert);
		
		
		//UPDATE
		
//		Employee emp=new Employee();
//		emp.setId(4);
//		emp.setName("Amit");
//		emp.setPosition("Director");
//		emp.setCompany("IBM");
//		
//		int insert = bean.update(emp);
//		System.out.println(insert);
		
		
		//DELETE
		
//		int delete = bean.delete(4);
//		System.out.println(delete);
		
		
		//READ
		
		
//		Employee read = bean.read(2);
//		System.out.println(read);
		
		
		List<Employee> all = bean.getAll();
		
		for(Employee e:all) {
			System.out.println(e);
		}

	}

}
