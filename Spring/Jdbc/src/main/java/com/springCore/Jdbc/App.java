package com.springCore.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Jdbc program" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/Jdbc/config.xml");
//        JdbcTemplate bean = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert into student table
//        
//        String query= "insert into student values(?,?,?)";
//        
//      int result  =bean.update(query,15,"Mani","Civil");
//        
//      System.out.println("Number of queries inserted:- "+result);
        
        
        
        StudentDao bean = context.getBean("implement",StudentDao.class);
//        Student stu=new Student();
//        stu.setId(15);
//        stu.setName("Mani");
//        stu.setBranch("Civil");
//        
//        int insert = bean.insert(stu);
//        
//        
//        
//        System.out.println(insert);    
//      Student st = bean.read(25);
//      System.out.println(st);
      
      List<Student> st = bean.getAll();
        
      for(Student s:st) {
        System.out.println(s);
    }
}
}
