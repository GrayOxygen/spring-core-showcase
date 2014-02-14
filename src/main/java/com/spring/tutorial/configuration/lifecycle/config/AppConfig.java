package com.spring.tutorial.configuration.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.configuration.lifecycle.beans.Foo;

@Configuration
public class AppConfig {

	@Bean(initMethod = "init")
	public Foo createFoo() {
		return new Foo();
	}
}
