package com.spring.tutorial.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.events.beans.EmailService;
import com.spring.tutorial.events.config.AppConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService emailService = ctx.getBean(EmailService.class);
		emailService.sendEmail("john.doe@example.org", "Notification for John Doe");
		ctx.close();
	}
}
