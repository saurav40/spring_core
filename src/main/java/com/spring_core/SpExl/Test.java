package com.spring_core.SpExl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("com/spring_core/SpExl/SpExplconfig.xml");
	   Demo d=context.getBean("demo",Demo.class);
	   System.out.println(d.toString());
	   SpelExpressionParser p=new SpelExpressionParser();
	   Expression exp=p.parseExpression("22+11");
	   System.out.println(exp.getValue());
	}
}
