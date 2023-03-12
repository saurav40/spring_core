package com.spring_core.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	 //Going to remove XML Configuration
	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/javaConfig/config.xml");
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    //TO close context we need to create ClassPathApplicaionContext reference bcz
	//close function is defined in ClassPathXmlApplicationContext and we can't access using ApplicationContext(I) reffernece
	Student s=context.getBean("stud",Student.class);
   s.study();
   context.close();
    
 }
}
