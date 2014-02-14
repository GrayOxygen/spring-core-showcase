package com.spring.tutorial.configuration.naming;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.naming.beans.Foo;
import com.spring.tutorial.configuration.naming.config.AppConfig;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo = ctx.getBean("myFoo", Foo.class);
		LOGGER.info("(Without bar) Foo.bar = " + foo.getBar());
		Foo fooWithBar = ctx.getBean("myFooWithBar", Foo.class);
		LOGGER.info("(With bar) Foo.bar = " + fooWithBar.getBar());
		Foo fooWithExtremeBar = ctx.getBean("myFooWithExtremeBar", Foo.class);
		LOGGER.info("(With extreme bar) Foo.bar = " + fooWithExtremeBar.getBar());
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
