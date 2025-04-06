package com.Employee;

import java.util.ArrayList;

public class CloudVandanaEmployees {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(55, "Sandeep", 400000);
		Employee emp2 = new Employee(98, "Yashwanth", 1200000);
		Employee emp3 = new Employee(32, "Srikanth", 850000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(emp1); employees.add(emp2); employees.add(emp3);
		System.out.println("--- Cloud Vandana Employee List ---");
		for(Employee emp : employees) {
			emp.displayDetails();
		}

	}

}
