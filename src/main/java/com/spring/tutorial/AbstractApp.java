package com.spring.tutorial;

public abstract class AbstractApp {
	protected Logger logger;

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	protected abstract void main();
}
