package com.spring.tutorial.configuration.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.componentscan.beans.Foo;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) ctx)
				.scan("com.spring.tutorial.configuration.componentscan.config");
		((AnnotationConfigApplicationContext) ctx).refresh();
		Foo foo = ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
