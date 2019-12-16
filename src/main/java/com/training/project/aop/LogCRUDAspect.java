package com.training.project.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.training.project.common.EmailClient;
import com.training.project.data.Company;

//@Aspect
public class LogCRUDAspect {
	
	Logger logger = LoggerFactory.getLogger(LogCRUDAspect.class);
	
	public void logBefore1(JoinPoint joinPoint) 
    {
        System.out.println("LogCRUDAspect.logBefore() : " + joinPoint.getSignature().getName());
    }
     
    public void logAfter1(JoinPoint joinPoint) 
    {
        System.out.println("LogCRUDAspect.logAfter() : " + joinPoint.getSignature().getName());
        Object obj[] = joinPoint.getArgs();
        Company company = (Company)obj[0];
        String msg = "Welcome to "+company.getCompanyName();
        EmailClient client = new EmailClient("jatin.sutaria@thev2technologies.com", msg);
    	try {
			client.sendMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
