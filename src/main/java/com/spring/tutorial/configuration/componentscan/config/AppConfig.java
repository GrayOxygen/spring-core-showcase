package com.spring.tutorial.configuration.componentscan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.componentscan.beans.Foo;

@Configuration
public class AppConfig {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}
}
