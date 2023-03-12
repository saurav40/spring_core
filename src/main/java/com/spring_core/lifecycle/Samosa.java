package com.spring_core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean,DisposableBean{
 private double price;

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Time to destroy");
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Time to init");
}
 
}
