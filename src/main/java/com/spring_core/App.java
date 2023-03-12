package com.spring_core;

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
        //System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Student obj=(Student)context.getBean("Student1");
        Student obj2=(Student)context.getBean("Student2");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
