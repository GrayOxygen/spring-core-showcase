package com.spring.tutorial.postprocessors.propertyplaceholder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.postprocessors.propertyplaceholder.beans.Foo;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/postprocessors/propertyplaceholder/applicationContext.xml");
		Foo foo = ctx.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		LOGGER.info("Foo.baz = " + foo.getBaz());
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
