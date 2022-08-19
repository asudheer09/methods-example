package com.example.methods;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="hi,hello,hey,yes,no";
		String[] words=name.split(",");
		System.out.println(" using , ");
		for(String w:words) {
			System.out.println(w);
		}
		
		System.out.println(" using space ");
		String n="hi hello hey yes no";
		String[] names=n.split(" ");
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
	}

}
