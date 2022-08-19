package com.example.methods;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		//List<String> list= Arrays.asList("hi","hello","india","cricket","books","java");
		
		List<String> list= new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("india");
		list.add("cricket");
		list.add("book");
		list.add("java");
		//list.add(10);
		
		/*
		 * 	for(dataType d: collection/array){
		 * 		
		 * 		System.out.println(d);
		 * 
		 * }
		 * 
		 * 
		 */
		System.out.println("===========using for each==========");
		for(String s:list) {
			//System.out.println(s.toUpperCase()+" here is I am adding");
			if("india".equals(s)) {
				System.out.println("I love you india");
			}
			
		}
		
		
		/*
		 *  dataType[] varaibleName={value1, value2, value3....};
		 */
		
		String[] myData= {"one","two","three","four","five"};
		
		System.out.println("===============iterating over array=================");
		for(String s:myData) {
			System.out.println(s);
		}
		
		
		
	}

}
