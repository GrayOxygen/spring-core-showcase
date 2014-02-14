package com.spring.tutorial.configuration.importing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.importing.beans.Foo;

@Configuration
public class AppConfigA {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}

}
