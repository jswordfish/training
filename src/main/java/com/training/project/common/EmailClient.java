package com.training.project.common;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

public class EmailClient {
	
	
	String msg;
	
	String to;
	
	String template = "<html>"+
			"<header><title>This is title</title></header>"+
			"<body>"+
			"${REPLACE}"+
			"</body>"+
			"</html>";
	
	public EmailClient(){
		
	}
	
	public EmailClient(String to, String msg){
		this.msg = msg;
		this.to = to;
	}
	
	public void sendMessage() throws Exception {
		
		HtmlEmail email = new HtmlEmail();
		  String host = "smtp.gmail.com";
		 // String from = config.getSendFrom();
		 
		  String from = "saranyadevi850@gmail.com";
		  String fromName = "Abm Admin";
		 // String pass = config.getSendFromPassword();
		  String pass = "maatramvendum";
		  String smtpPort = "465";
		  email.setHostName(host);
		  email.setSmtpPort(Integer.parseInt(smtpPort));
		 
		  
		  
	  		email.addTo(getTo());
	  		msg = template.replace("${REPLACE}", getMsg());	
	  		email.setHtmlMsg(msg);
	  		email.setSubject("test");
		  	email.setCharset("UTF-8");
		  
		  email.setFrom(from, fromName);
		 
		  
		 
		  email.setAuthenticator(new DefaultAuthenticator(from, pass)	);
			email.setTLS(false);//change here
			//email.setSmtpPort(Integer.parseInt(smtpPort));
			email.setSSL(true);
			email.setDebug(true);
			
			email.buildMimeMessage();
		
			
			email.sendMimeMessage();
		  System.out.println("Email Sent");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	

}
