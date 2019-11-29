package com.training.java8;

public class LamdaExpressionWithoutParameter {

	public static void main(String[] args) {  
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
}

interface Sayable{  
    public String say();  
}
