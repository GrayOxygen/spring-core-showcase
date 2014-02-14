package com.spring.tutorial.di.dependson;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.dependson.beans.Foo;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/dependson/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		LOGGER.info("Foo = " + foo);
		((ClassPathXmlApplicationContext) context).close();
	}
}
