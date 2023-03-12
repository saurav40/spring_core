package com.spring_core.ci;

public class Certi {
 private String cname;

public Certi(String cname) {
	super();
	this.cname = cname;
}

@Override
public String toString() {
	return "Certi [name=" + cname + "]";
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}
}
