package com.example.methods;

public class WritingMethods {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		
		WritingMethods wm= new WritingMethods();
		int c=wm.add(10, 20);
		System.out.println("sum of two numbers is "+c);
		System.out.println("subtraction of two numbers is "+wm.subtraction(20, 10));
		
	}

}
