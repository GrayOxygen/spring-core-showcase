package com.spring.tutorial.di.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.setterbased.beans.dependent.Foo;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/setterbased/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
