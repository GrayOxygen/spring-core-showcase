package com.spring.tutorial.postprocessors.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.postprocessors.beanpostprocessor.messages.Messenger;

public class App {
	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/postprocessors/beanpostprocessor/applicationContext.xml");
		Messenger messenger = (Messenger) ctx.getBean("messenger");
		System.out.println(messenger);
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
