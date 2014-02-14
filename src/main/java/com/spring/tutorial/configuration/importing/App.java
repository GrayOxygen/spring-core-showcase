package com.spring.tutorial.configuration.importing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.importing.beans.Bar;
import com.spring.tutorial.configuration.importing.beans.Foo;
import com.spring.tutorial.configuration.importing.config.AppConfigB;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfigB.class);
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo = " + foo);
		Bar bar = ctx.getBean(Bar.class);
		LOGGER.info("Bar = " + bar);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
