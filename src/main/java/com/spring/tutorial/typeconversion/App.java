package com.spring.tutorial.typeconversion;

import java.util.Date;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.Formatter;
import org.springframework.format.support.FormattingConversionService;

import com.spring.tutorial.typeconversion.beans.Foo;
import com.spring.tutorial.typeconversion.formatters.DateFormatter;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/typeconversion/applicationContext.xml");

		FormattingConversionService convService = ctx.getBean(FormattingConversionService.class);
		
		Formatter<Date> dateFormatter = ctx.getBean(DateFormatter.class);

		LOGGER.info("Can convert from String to Foo? " + (convService.canConvert(String.class, Foo.class) ? "Y" : "N"));

		Foo foo = convService.convert("This is a bar", Foo.class);

		LOGGER.info("Foo.bar = " + foo.getBar());
		
		Date currentDate = new Date();
		
		LOGGER.info("Current date: " + dateFormatter.print(currentDate, Locale.getDefault()));
		
		ctx.close();
	}
}
