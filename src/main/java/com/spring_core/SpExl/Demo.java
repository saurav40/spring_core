package com.spring_core.SpExl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
 @Value("#{34+10}")
 private int x;
 @Value("#{100%3}")
 private int y;
 @Value("#{T(java.lang.Math).sqrt(25)}")
 private double z;
 
 @Value("#{T(java.lang.Math).PI}")
 private double e;
 
 @Value("#{new String('Saurabh')}")
 private String name;
 @Value("#{2>1?true:false}") 
 private boolean isActive;
 
public String getName() {
	return name;
}

public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public void setName(String name) {
	this.name = name;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
}

}
