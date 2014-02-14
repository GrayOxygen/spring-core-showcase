package com.spring.tutorial.configuration.javaandxml.xmlcentric;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.configuration.javaandxml.xmlcentric.beans.Foo;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/configuration/javaandxml/xmlcentric/applicationContext.xml");
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
