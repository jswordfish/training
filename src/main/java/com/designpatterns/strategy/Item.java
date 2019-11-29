package com.designpatterns.strategy;

public class Item {
	
	Float unitPrice;
	
	Integer costPerUnit;
	
	String name;
	
	public Item(){
		
	}
	
	public Item(String name, Float unitPrice, Integer costPerUnit){
		this.name = name;
		this.unitPrice = unitPrice;
		this.costPerUnit = costPerUnit;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(Integer costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
