package com.designpatterns.strategy;

public interface BillingStrategy {
	
	public Double getPrice(Float actualPrice, Integer number);

}
