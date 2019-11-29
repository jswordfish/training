package com.training.java8test;

import java.util.ArrayList;
import java.util.List;

public class WithoutLamda {
	private static int findSquareOfMaxOdd(List<Integer> numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}
	/**
	 * need to write a method to find out the maximum odd number
	 *  in the range 3 to 11 and return square of it
	 * @param args
	 */
	public static void main(String args[]){
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
