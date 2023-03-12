package com.spring_core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/lifecycle/configlc.xml");
//     ApplicationContext doesn't shutdownhook method which is required to call destroy method.
//      so for that we will use AbstractApplicationContext where Shutdownhook method is present.
     AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/lifecycle/configlc.xml");
		
//		 Pepsi p=(Pepsi)context.getBean("pepsi"); 
//		 System.out.println(p);
		 Samosa s=(Samosa)context.getBean("samosa"); 
		 System.out.println(s);
		 
//     Example sub=(Example)context.getBean("example");
//     System.out.println(sub);
     context.registerShutdownHook();
	}

}
