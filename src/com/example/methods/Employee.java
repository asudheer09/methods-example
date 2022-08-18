package com.example.methods;

public class Employee {

	private int id;
	private String name;
	private double salaray;

	public Employee(int id, String name, double salaray) {
		super();
		this.id = id;
		this.name = name;
		this.salaray = salaray;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaray() {
		return salaray;
	}

	public void setSalaray(double salaray) {
		this.salaray = salaray;
	}
	
	// print the object details
		public void printEmployeeDetails() {
			System.out.println("Employee id is " + id);
			System.out.println("Employee name is " + name);
			System.out.println("Employee salary is " + salaray);
		}

}
