package com.spring_core.ci;

public class Person {
 private String name;
 private int personId;
 private Certi certi;
public Person(String name, int personId,Certi certi) {
	super();
	this.name = name;
	this.personId = personId;
	this.certi=certi;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public Certi getCerti() {
	return certi;
}
public void setCerti(Certi certi) {
	this.certi = certi;
}
@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
}

}
