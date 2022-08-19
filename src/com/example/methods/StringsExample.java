package com.example.methods;

public class StringsExample {

	public static void main(String[] args) {
		String s1="hello"; // create object in SCP
		
		String s2= new String("hello");// heap memory
		
		String s3="hello";
		String s4= new String("hello");
		
		
		System.out.println(s1==s2); //false
		
		System.out.println(s1==s3); //true
		
		System.out.println(s2==s4); //false
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		String s5="heyHello";
		String s6= new String("heyhello");
		
		System.out.println(s5.equalsIgnoreCase(s6));
		

		
		
		
	}

}
