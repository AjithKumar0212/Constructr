package org.cons; 
public class A extends B  {
	  public A(){super(); 
	    System.out.println("Default const...");
	  } 
	  public static void main(String[] args) { 
	    A a = new A();
	  } 
	} 