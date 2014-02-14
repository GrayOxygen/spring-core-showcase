package com.spring.tutorial.di.annotationbased.resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.annotationbased.resource.beans.Foo;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/annotationbased/resource/applicationContext.xml");
		Foo foo = ctx.getBean("foo", Foo.class);
		LOGGER.info("Foo.baz = " + foo.getBaz());
		LOGGER.info("Foo.mildBar = " + foo.getMildBar());
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
