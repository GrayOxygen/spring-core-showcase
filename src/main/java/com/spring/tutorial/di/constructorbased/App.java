package com.spring.tutorial.di.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.constructorbased.beans.dependent.Foo;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/constructorbased/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		Foo fooWithConstructorNamedArgs = context.getBean(
				"fooWithConstructorNamedArgs", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
