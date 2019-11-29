package com.training.java8;

public class LamdaExpressionWithMultipleParameters {
	public static void main(String[] args) {  
        
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->{return (a+b);};  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  //you can skip using return if u use circular braces instead of curly braces
        System.out.println(ad2.add(100,200));  
    }  
}

interface Addable{  
    int add(int a,int b);  
} 
