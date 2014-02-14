package com.spring.tutorial.di.compoundpropname;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.compoundpropname.beans.Foo;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/compoundpropname/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar.baz = " + foo.getBar().getBaz());
		((ClassPathXmlApplicationContext) context).close();
	}
}
