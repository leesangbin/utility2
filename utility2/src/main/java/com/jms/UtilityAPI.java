package com.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("jmsEmail")
public class UtilityAPI {
 
	@Autowired
	private MailSender jmsMail; // MailSender interface defines a strategy
										// for sending simple mails
 
	public void jmsReadyToSendEmail(String fromAddress, String subject, String msgBody, String[] toAddress, String[] toCc, String[] toBcc) {
 
		
		
		
		for(String address : toAddress){
	        // do what ever you want
			System.out.println("to="+address);
	    }
		
		for (String bcc : toBcc) {
			System.out.println("bcc="+bcc);
		}
		
		for (String cc : toCc) {
			System.out.println("cc="+cc);
		}
		
		
		SimpleMailMessage jmsMailMsg = new SimpleMailMessage();
		jmsMailMsg.setFrom(fromAddress);
		jmsMailMsg.setTo(toAddress);
		jmsMailMsg.setCc(toCc);
		jmsMailMsg.setBcc(toBcc);
		
		
		jmsMailMsg.setSubject(subject);
		jmsMailMsg.setText(msgBody);
		jmsMail.send(jmsMailMsg);
	}
	
	
	
	
	
	
	
	
	
	
}