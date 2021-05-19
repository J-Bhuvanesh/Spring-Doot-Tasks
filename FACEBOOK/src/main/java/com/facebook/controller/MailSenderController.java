package com.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.facebook.service.MailSenderService;

@Controller
public class MailSenderController {
	
	@Autowired
	private MailSenderService service;
	
	
	@Scheduled(cron="0/180 * * * * *")
    public void sendReminder(){
		service.run(); 

    }
	

}
