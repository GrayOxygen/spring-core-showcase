package com.spring.tutorial.configuration.easenavigation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.tutorial.configuration.easenavigation.beans.Bar;

@Configuration
@Import(AppConfigA.class)
public class AppConfigB {

	@Bean
	public Bar createBar() {
		return new Bar();
	}
}
