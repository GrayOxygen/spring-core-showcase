package com.spring.tutorial.di.collections;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.tutorial.di.collections.beans.Foo;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/di/collections/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		LOGGER.info("Foo.list = " + foo.getList());
		LOGGER.info("Foo.map = " + foo.getMap());
		LOGGER.info("Foo.props = " + foo.getProps());
		LOGGER.info("Foo.set = " + foo.getSet());
		LOGGER.info("Foo.strongTypedMap = " + foo.getStrongTypedMap());
		Foo fooChild = context.getBean("fooChild", Foo.class);
		LOGGER.info("FooChild.list" + fooChild.getList());
		LOGGER.info("FooChild.map = " + fooChild.getMap());
		LOGGER.info("FooChild.props = " + fooChild.getProps());
		LOGGER.info("FooChild.set = " + fooChild.getSet());
		((ClassPathXmlApplicationContext) context).close();
	}
}
