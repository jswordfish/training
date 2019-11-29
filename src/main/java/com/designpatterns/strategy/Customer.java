package com.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	BillingStrategy strategy = new NormalBillingStrategy();
	
	List<Item> items = new ArrayList<Item>();
	
	public Customer(){
		
	}
	
	

	public List<Item> getItems() {
		return items;
	}



	public void setItems(List<Item> items) {
		this.items = items;
	}



	public BillingStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(BillingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void printBill(){
		Double totPrice = 0d;
		for(Item item : items){
			totPrice += getStrategy().getPrice(item.getUnitPrice(), item.getCostPerUnit());
		}
		System.out.println("Total price is "+totPrice);
	}

}
