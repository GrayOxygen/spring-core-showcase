package com.spring.tutorial.configuration.scope.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	public Foo() {
		LOGGER.info("Creating new Foo");
	}
}
