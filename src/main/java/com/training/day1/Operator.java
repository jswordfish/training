package com.training.day1;

public enum Operator {
	
	
	
	ADD("ADD"), SUBSTR("SUBSTR"), DIV("DIV"), MULT("MULT");
	
	String op;
	
	private Operator(String op){
		this.op = op;
	}

	public String getOp() {
		return op;
	}
	
	

}
