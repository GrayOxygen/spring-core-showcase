package com.spring.tutorial.typeconversion.formatters;

import static java.util.Arrays.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.format.number.CurrencyFormatter;
import org.springframework.format.number.NumberFormatter;
import org.springframework.format.number.PercentFormatter;

public final class NumberFormatAnnotationFormatterFactory implements
		AnnotationFormatterFactory<NumberFormat> {

	public Set<Class<?>> getFieldTypes() {
		return new HashSet<Class<?>>(asList(new Class<?>[] { Short.class,
				Integer.class, Long.class, Float.class, Double.class,
				BigDecimal.class, BigInteger.class }));
	}

	public Printer<Number> getPrinter(NumberFormat annotation,
			Class<?> fieldType) {
		return configureFormatterFrom(annotation, fieldType);
	}

	public Parser<Number> getParser(NumberFormat annotation, Class<?> fieldType) {
		return configureFormatterFrom(annotation, fieldType);
	}

	private Formatter<Number> configureFormatterFrom(NumberFormat annotation,
			Class<?> fieldType) {
		if (!annotation.pattern().isEmpty()) {
			return new NumberFormatter(annotation.pattern());
		} else {
			Style style = annotation.style();
			if (style == Style.PERCENT) {
				return new PercentFormatter();
			} else if (style == Style.CURRENCY) {
				return new CurrencyFormatter();
			} else {
				return new NumberFormatter();
			}
		}
	}
}