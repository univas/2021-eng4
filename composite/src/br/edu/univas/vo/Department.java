package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {
	
	private String name;
	private List<Employee> employees;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	@Override
	public void printName() {
		System.out.println("Name: " + name);
		employees.forEach(Employee::printName);
	}
	
	public void addChild(Employee employee) {
		this.employees.add(employee);
	}
	
	public void removeChild(Employee employee) {
		this.employees.remove(employee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
