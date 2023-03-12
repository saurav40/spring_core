package com.spring_core.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")//Scope annotation can be used only with Component annotation
public class Student {
 @Value("Hyderabad")
 private String city;
 @Value("Saurabh Sah")
 private String studentName;
 //ADDing Collections to our entitiy
 @Value("#{l1}")
 private List<String> address;
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
@Override
public String toString() {
	return "Student [city=" + city + ", studentName=" + studentName + ", address=" + address + "]";
}

 
}
