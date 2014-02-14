package com.spring.tutorial.configuration.javaandxml.javacentric;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.javaandxml.javacentric.beans.Foo;
import com.spring.tutorial.configuration.javaandxml.javacentric.config.AppConfig;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
