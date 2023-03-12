package com.spring_core.javaConfig;

import org.springframework.stereotype.Component;

//@Component //We are now using @Bean configuration in JavaConfig class to create object of This class 
public class Student {

  private Samosa samos;
  
  public Student(Samosa samos) {
	super();
	this.samos = samos;
}

public Samosa getSamos() {
	return samos;
}

public void setSamos(Samosa samos) {
	this.samos = samos;
}

void study()
  {
	  this.samos.display();
	  System.out.println("Have fun with no XML Configuration");
  }
}
