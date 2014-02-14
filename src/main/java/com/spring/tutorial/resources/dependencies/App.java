package com.spring.tutorial.resources.dependencies;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.resources.dependencies.beans.Foo;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		// Full classpath
		// ClassPathXmlApplicationContext ctx =
		// new ClassPathXmlApplicationContext("com/spring/tutorial/resources/dependencies/applicationContext.xml");
		// Relative classpath with Class argument
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml", App.class);
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.resources type: " + foo.getResources().getClass());
		LOGGER.info("Foo.resources exists? " + (foo.getResources().exists() ? "Y" : "N"));
		ctx.close();
	}
}
