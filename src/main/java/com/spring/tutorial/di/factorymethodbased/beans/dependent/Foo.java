package com.spring.tutorial.di.factorymethodbased.beans.dependent;

import com.spring.tutorial.di.factorymethodbased.beans.dependencies.Bar;
import com.spring.tutorial.di.factorymethodbased.beans.dependencies.Baz;

public class Foo {
	private Bar bar;
	private Baz baz;

	private Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

	public static Foo createFoo(Bar bar, Baz baz) {
		Foo foo = new Foo(bar, baz);
		return foo;
	}
}
