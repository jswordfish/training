package com.training.designpatterns;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.designpatterns.strategy.Customer;
import com.designpatterns.strategy.HappyHourBillingStrategy;
import com.designpatterns.strategy.Item;

public class TestStrategy {
	@Test
	public void testStrategy(){
		Item item1 = new Item("Pepsi", 50f, 50);
		Item item2 = new Item("Coke", 50f, 50);
		Item item3 = new Item("Thumps Up", 50f, 50);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		Customer customer = new Customer();
		customer.setItems(items);
		customer.setStrategy(new HappyHourBillingStrategy());
		customer.printBill();
	}

}
