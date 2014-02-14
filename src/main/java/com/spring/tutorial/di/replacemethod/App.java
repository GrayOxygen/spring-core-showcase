package com.spring.tutorial.di.replacemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.replacemethod.beans.Foo;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/replacemethod/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		foo.process();
		((ClassPathXmlApplicationContext) context).close();
	}
}
