package com.example.methods;

import java.util.Scanner;

public class StringReversExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a string ");
		String word=sc.nextLine();
		
		char[] chars=word.toCharArray();
		
		String reverse="";
		
		for(int i=chars.length-1;i>=0;i--) {
			reverse=reverse+chars[i];
		}
		
		System.out.println("reverse of the string is "+reverse);
		/*
		 * int x=20; int y=20; System.out.println(x==y); //true
		 */		
		if(word.equals(reverse)) {
			System.out.println("given String is palindrome");
		}else {
			System.out.println("given String is not palindrome");
		}
		
	}

}
