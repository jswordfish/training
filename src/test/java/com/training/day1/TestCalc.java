package com.training.day1;

import org.junit.Test;

import junit.framework.Assert;

public class TestCalc {
	
	CalculatorService calcService = new CalculatorServiceImpl();
	@Test
	public void testAddCalc(){
		Integer no1 = 50;
		Integer no2 = 50;
		Integer expectedOutput = 100;
		Integer actualresult = calcService.add(no1, no2);
		Assert.assertEquals(expectedOutput, actualresult);
	
	}
	@Test
	public void testCalcGeneral(){
		Group parent  = new Group();
		
	}

}
