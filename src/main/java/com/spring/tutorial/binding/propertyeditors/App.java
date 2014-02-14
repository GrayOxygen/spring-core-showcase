package com.spring.tutorial.binding.propertyeditors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.binding.propertyeditors.beans.Foo;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/binding/propertyeditors/applicationContext.xml");
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.name = " + foo.getName());
		LOGGER.info("Foo.date = " + foo.getDate());
		ctx.close();
	}
}
