package com.training.day1;

public class Group {
	
	Double number1;
	
	Double number2;
	
	Operator operator = Operator.ADD;
	
	Group group;

	public Double getNumber1() {
		return number1;
	}

	public void setNumber1(Double number1) {
		this.number1 = number1;
	}

	public Double getNumber2() {
		return number2;
	}

	public void setNumber2(Double number2) {
		this.number2 = number2;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	
	
	

}
