package com.training.java8test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaExample {
	/**
	 * double colon (::) operator, it’s introduced in Java 8 and used 
	 * for method references. Java Compiler takes care of mapping the arguments 
	 * to the called method. It’s short form of lambda expressions i -> isGreaterThan3(i)
	 *  or i -> NumberTest.isGreaterThan3(i)
	 * @param numbers
	 * @return
	 */
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(LamdaExample::isOdd) 		//Predicate is functional interface and
				.filter(LamdaExample::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(LamdaExample::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}

	/**
	 * need to write a method to find out the maximum odd number
	 *  in the range 3 to 11 and return square of it
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(100);
		nums.add(2);
		nums.add(3);
		nums.add(10);
		nums.add(7);
		nums.add(5);
		System.out.println(findSquareOfMaxOdd(nums));
	}
	
	
	

}
