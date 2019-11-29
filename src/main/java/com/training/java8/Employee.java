package com.training.java8;

public class Employee implements Comparable<Employee>{
	
	String name;
	
	String role = "MANAGER";
	
	Long salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Employee(String name, String role, Long salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public Employee(){
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary.intValue()  - o.getSalary().intValue();
	}

}
