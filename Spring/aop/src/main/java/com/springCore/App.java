package com.springCore;


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
      ApplicationContext context=  new ClassPathXmlApplicationContext("com/springCore/config.xml");
      Transaction bean = context.getBean("transaction",Transaction.class);
      
      bean.account();
    }
}
