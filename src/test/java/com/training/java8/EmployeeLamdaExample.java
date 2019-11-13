package com.training.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeLamdaExample {
	
	private static Employee getHighestPayingManager(List<Employee> emps){
//		return emps.stream().filter(emp -> EmployeeLamdaExample.isManager(emp))
//				.max(Comparator.naturalOrder())
//				.get();
		return emps.stream().filter(emp -> EmployeeLamdaExample.isManager(emp))
				.max(Comparator.naturalOrder())
				.get();
				
	}
	
	private static boolean isManager(Employee emp){
		if(emp.getRole().equalsIgnoreCase("Manager")){
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String args[]){
		Employee employee1 = new  Employee("Amit", "ADMIN", 10000l);
		Employee employee2 = new  Employee("Samit", "ADMIN", 20000l);
		Employee employee3 = new  Employee("Nitin", "ADMIN", 30000l);
		Employee employee4 = new  Employee("Rakesh", "ADMIN", 40000l);
		
		Employee employee5 = new  Employee("Baldev", "MANAGER", 10000l);
		Employee employee6 = new  Employee("Brijesh", "MANAGER", 20000l);
		Employee employee7 = new  Employee("Aatish", "MANAGER", 30000l);
		Employee employee8 = new  Employee("Chunky", "MANAGER", 40000l);
		
		
		Employee employee9 = new  Employee("Mohsin", "EMPLOYEE", 10000l);
		Employee employee10 = new  Employee("Siraj", "EMPLOYEE", 20000l);
		Employee employee11 = new  Employee("Vihan", "EMPLOYEE", 30000l);
		Employee employee12 = new  Employee("Vraj", "EMPLOYEE", 40000l);
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(employee1);
		emps.add(employee2);
		emps.add(employee3);
		emps.add(employee4);
		emps.add(employee5);
		emps.add(employee6);
		emps.add(employee7);
		emps.add(employee8);
		emps.add(employee9);
		emps.add(employee10);
		emps.add(employee11);
		emps.add(employee12);
		
		Employee highestPayingManager = getHighestPayingManager(emps);
		System.out.println(highestPayingManager.getName()+" "+highestPayingManager.getSalary());
		
	}

}
