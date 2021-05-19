package com.facebook.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class MailSenderService {
	
	
	 @Autowired
	    private JavaMailSender javaMailSender;
	
	 

    public void run() {

    
        System.out.println("Sending Email...");
        sendEmail();
        System.out.println("Done");

    }
 
	    void sendEmail() {

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("jbhuvi452@gmail.com");

	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("Congratulations");
	        javaMailSender.send(msg);

	    }

}
