package com.spring.tutorial.typeconversion.converters;

import org.springframework.core.convert.converter.Converter;

import com.spring.tutorial.typeconversion.beans.Foo;

public class StringToFoo implements Converter<String, Foo> {
	@Override
	public Foo convert(String text) {
		return new Foo(text);
	}
}
