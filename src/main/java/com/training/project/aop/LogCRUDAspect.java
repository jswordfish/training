package com.training.project.aop;

import org.aspectj.lang.JoinPoint;

//@Aspect
public class LogCRUDAspect {
	
	public void logBefore1(JoinPoint joinPoint) 
    {
        System.out.println("LogCRUDAspect.logBefore() : " + joinPoint.getSignature().getName());
    }
     
    public void logAfter1(JoinPoint joinPoint) 
    {
        System.out.println("LogCRUDAspect.logAfter() : " + joinPoint.getSignature().getName());
    }

}
