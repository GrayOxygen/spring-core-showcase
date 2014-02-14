package com.spring.tutorial.di.cnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.cnamespace.beans.Foo;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/cnamespace/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		Foo fooWithCNamespace = context.getBean("fooWithCNamespace", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
