package com.spring.tutorial.configuration.injection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.injection.beans.Foo;
import com.spring.tutorial.configuration.injection.beans.Bar;

@Configuration
public class AppConfigA {
	@Autowired
	private Bar bar;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		foo.setBar(bar);
		return foo;
	}

}
