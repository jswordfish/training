package com.training.project.common;

public class ProjectException extends RuntimeException{
	
	public ProjectException(){
		
	}
	
	public ProjectException(String msg){
		super(msg);
	}
	
	public ProjectException(String msg, Throwable t){
		super(msg, t);
	}

}
