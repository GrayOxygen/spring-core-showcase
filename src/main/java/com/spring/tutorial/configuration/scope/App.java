package com.spring.tutorial.configuration.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.configuration.scope.beans.Foo;
import com.spring.tutorial.configuration.scope.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo1 = ctx.getBean(Foo.class);
		Foo foo2 = ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
