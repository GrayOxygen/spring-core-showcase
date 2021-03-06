package com.spring.tutorial.configuration.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.lifecycle.beans.Foo;
import com.spring.tutorial.configuration.lifecycle.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo = ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
