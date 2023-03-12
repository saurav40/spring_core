package com.spring_core.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/auto/wire/annotation/configwire.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
	}

}
