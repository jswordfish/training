package com.designpatterns.strategy;

public class HappyHourBillingStrategy implements BillingStrategy{

	@Override
	public Double getPrice(Float actualPrice, Integer number) {
		// TODO Auto-generated method stub
		return (double) ((actualPrice * number)/2);
	}

}
