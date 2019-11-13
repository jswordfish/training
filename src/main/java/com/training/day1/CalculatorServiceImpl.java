package com.training.day1;

public class CalculatorServiceImpl implements CalculatorService {

	public Integer add(Integer no1, Integer no2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Float add(Float... arguments) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Use recursion to resolve all groups in the parent object and 
	 * return the final outcome
	 */
	public Double calculate(Group group) {
		// TODO Auto-generated method stub
		/**
		 * Call process in recursion
		 */
		//..
		
		return process(group);
	}
	
	private Double process(Group group){
		/**
		 * Process the group here
		 */
		return 100.0;
	}

}
