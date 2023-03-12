package com.spring_core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/stereotype/configst.xml");
	  Student obj=context.getBean("s1",Student.class);
	  Student obj2=context.getBean("student",Student.class);
	  System.out.println(obj.hashCode());
	  System.out.println(obj2.hashCode());
	  System.out.println(obj);
	  System.out.println(obj2);
	  //Here hashcode is same so it is singleton type object
	  //To get unique hashcode for different object we need to change 
	  // the scope of the class to prototype in XML configuration file or using Annotation @Scope("prototype") below @Component
	  
	}

}
