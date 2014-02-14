package com.spring.tutorial.di.lifecycle.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/lifecycle/postprocessor/applicationContext.xml");
		((ClassPathXmlApplicationContext) context).close();
	}
}
