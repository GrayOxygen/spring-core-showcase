package com.spring.tutorial.di.nullvalues;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.nullvalues.beans.Foo;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/nullvalues/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		Foo fooWithNullBar = context.getBean("fooWithNullBar", Foo.class);
		LOGGER.info("Foo.bar = " + fooWithNullBar.getBar());
		((ClassPathXmlApplicationContext) context).close();
	}
}
