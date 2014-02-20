package com.spring.tutorial.typeconversion;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.support.FormattingConversionService;

import com.spring.tutorial.typeconversion.beans.Foo;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/tutorial/typeconversion/applicationContext.xml");

		FormattingConversionService convService = ctx.getBean(FormattingConversionService.class);
                
		LOGGER.info("Can convert from String to Foo? " + (convService.canConvert(String.class, Foo.class) ? "Y" : "N"));

		Foo foo = convService.convert("This is a bar", Foo.class);

		LOGGER.info("Foo.bar = " + foo.getBar());
		
		Date currentDate = new Date();
		
                String formattedDate = convService.convert(currentDate, String.class);
                
                LOGGER.info("Formatted date: " + formattedDate);
                
		ctx.close();
	}
}
