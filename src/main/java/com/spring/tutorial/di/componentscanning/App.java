package com.spring.tutorial.di.componentscanning;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.componentscanning.beans.Foo;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/componentscanning/applicationContext.xml");
		Foo foo = context.getBean(Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		((ClassPathXmlApplicationContext) context).close();
	}
}
