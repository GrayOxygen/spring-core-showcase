package com.spring.tutorial;

public abstract class LogHandler<LogImplLevel> implements Logger {

	protected abstract LogImplLevel mapLogLevels(LogLevels logLevel);

	protected abstract void logImpl(LogImplLevel logImplLevel, Object msg);

	@Override
	public void log(LogLevels logLevel, Object msg) {
		logImpl(mapLogLevels(logLevel), msg);
	}
}
