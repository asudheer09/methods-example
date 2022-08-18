package com.example.methods;

public class StringExamples {

	public static void main(String[] args) {
		String s="helloWorld low hi low";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('z'));
		System.out.println(s.lastIndexOf("low"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		char[] chars= s.toCharArray();
		
		// normal for loop
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
		
		//using java5 for each
		for(char c:chars) {
			System.out.println(c);
		}
		
		
	}

}
