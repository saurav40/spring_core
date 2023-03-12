package com.spring_core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
  private String subject;

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}
@PostConstruct
public void start()//Name could be anything
{
   System.out.println("Initilization code is executing");	
}
@PreDestroy
public void end()
{
	System.out.println("CleanUp code is executing");
}
}
