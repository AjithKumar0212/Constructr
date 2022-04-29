package org.cons;

public class EmployeeDetails {
	public EmployeeDetails() {this(99);
		System.out.println("default constructor");
	}
	EmployeeDetails(int a){
//		super();
		System.out.println("int parameterized constructor "+a);
	}
	EmployeeDetails(String a){ this();
		System.out.println("String parameterized constructor "+a);
	}
	public static void main(String[] args) {
		
		new EmployeeDetails("Ak");
	}

}
