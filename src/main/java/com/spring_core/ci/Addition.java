package com.spring_core.ci;

public class Addition {
  private int a;
  private int b;
  public Addition(double a,double b)
  {
  	this.a=(int)a;
  	this.b=(int)b;
  	System.out.println("Double Double");
  }
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("Int Int");
}
public Addition(String a,String b)
{
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
	System.out.println("String String");
}
  

  public void doSum()
  {
	  System.out.println("Sum = "+(this.a+this.b));
  }
}
