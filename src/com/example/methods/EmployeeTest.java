package com.example.methods;

public class EmployeeTest {
	
	public static String toUpperCase(Employee emp) {
		return emp.getName().toUpperCase();
	}

	public static String toLowerCase(Employee emp) {
		return emp.getName().toLowerCase();
	}

	
	public static void main(String[] args) {
		
		Employee e1= new Employee(11, "abhishek",50000);
		Employee e2= new Employee(12, "arun",70000);
		e1.printEmployeeDetails();
		
		System.out.println("===================");
		
		e2.printEmployeeDetails();
		
		String output=EmployeeTest.toUpperCase(e1);
		
		System.out.println("after coverting the name is "+output);
		
		
		
	}

}
