package com.Employee;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs " + salary);
        System.out.println();
    }

}
