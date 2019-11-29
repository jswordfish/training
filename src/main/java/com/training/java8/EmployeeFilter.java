package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;





public class EmployeeFilter {
	
	public static void main(String args[]){
		Employee employee1 = new Employee("jatin", "Admin", 10000l);
		Employee employee2 = new Employee("hitesh", "Admin", 10000l);
		Employee employee3 = new Employee("ram", "Admin", 10000l);
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(employee1);
		emps.add(employee2);
		emps.add(employee3);
		
		Stream<Employee> es = emps.stream().filter((emp) -> {return emp.getName().startsWith("ja");});
		es.forEach(emp -> {System.out.println(emp.getName());});
	}

}
