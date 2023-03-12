package com.spring_core.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/ci/configci.xml");
		Person p=(Person)context.getBean("person");
		Person p2=(Person)context.getBean("pref");
		System.out.println(p);
		System.out.println(p2);
		Addition add=(Addition)context.getBean("addref0");
		Addition add1=(Addition)context.getBean("addref1");
		Addition add2=(Addition)context.getBean("addref2");
		add.doSum();
		add1.doSum();
		add2.doSum();
//		System.out.println(p);
//        System.out.println(p2);
	}

}
