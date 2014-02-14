package com.spring.tutorial.di.constructorbased.beans.dependent;

import java.beans.ConstructorProperties;

import com.spring.tutorial.di.constructorbased.beans.dependencies.Bar;
import com.spring.tutorial.di.constructorbased.beans.dependencies.Baz;

public class Foo {
	private Bar bar;
	private Baz baz;

	@ConstructorProperties({ "bar", "baz" })
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

}
