package com.spring.tutorial.di.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.methodinjection.beans.Foo;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/methodinjection/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		foo.process();
		((ClassPathXmlApplicationContext) context).close();
	}
}
