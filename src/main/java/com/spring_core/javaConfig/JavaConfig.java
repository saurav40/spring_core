package com.spring_core.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration    //This means this class going to handle configuration
//@ComponentScan(basePackages = "com.spring_core.javaConfig")//To add base packages to scan
public class JavaConfig {

	 @Bean
	 Samosa getSamosa()
	 {
		 return new Samosa();
	 }
	 @Bean(name= {"student","stud","xyz"})
	 Student getStudent()
	 {
		 return new Student(getSamosa());
	 }
	 //Note :Since we are not using @Component to scan classes so now
	 // we can remove @ComponentScan from above configuration
}
