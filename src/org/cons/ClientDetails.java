package org.cons;

public class ClientDetails extends EmployeeDetails {
	public ClientDetails() {
		super("sk");
		System.out.println("child default ");
	}
	ClientDetails (int a){this();
		System.out.println("child int parameter "+a);
	}
	ClientDetails(int a ,float b){ this(99);
		System.out.println(" id and salary"+a+"\t"+b);
		
	}public static void main(String[] args) {
		new ClientDetails(232,44.33f);
		new ClientDetails(22);
		
	}

}
