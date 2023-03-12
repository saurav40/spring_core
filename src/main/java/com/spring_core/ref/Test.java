package com.spring_core.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/ref/configref.xml");
		
		A obj=(A)context.getBean("aref");
		A obj2=(A)context.getBean("aref2");
		System.out.println(obj);
		System.out.println(obj2);

	}

}
