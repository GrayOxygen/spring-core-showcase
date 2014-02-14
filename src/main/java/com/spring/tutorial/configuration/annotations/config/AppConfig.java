package com.spring.tutorial.configuration.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.annotations.beans.Foo;

@Configuration
public class AppConfig {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}
}
