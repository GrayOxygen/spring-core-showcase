package com.spring.tutorial.configuration.javaandxml.xmlcentric.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.javaandxml.xmlcentric.beans.Foo;
import com.spring.tutorial.configuration.javaandxml.xmlcentric.beans.Bar;

@Configuration
public class AppConfig {
	@Autowired
	private Bar bar;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		foo.setBar(bar);
		return foo;
	}

}
