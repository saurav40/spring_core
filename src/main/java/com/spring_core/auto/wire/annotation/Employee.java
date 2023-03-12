package com.spring_core.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
 
@Autowired
@Qualifier("temp2")
 private Address address;

public Employee() {
	super();
}

public Address getAddress() {
	return address;
}
//@Autowired
public void setAddress(Address address) {
	this.address = address;
	System.out.println("Inside setter");
}

public Employee(Address address) {
	super();
	this.address = address;
	System.out.println("Inside Constructor");
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}
}
