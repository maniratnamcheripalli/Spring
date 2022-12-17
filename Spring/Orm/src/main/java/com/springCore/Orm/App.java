package com.springCore.Orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );    
        ApplicationContext context=new ClassPathXmlApplicationContext("OrmConfig.xml");
        StudentDao bean = context.getBean("studentDao",StudentDao.class);
        Student stu=new Student(15,"Mani","Hyderabad","Vignan");
        int insert = bean.insert(stu);
        System.out.println(insert);
    
    }
}
