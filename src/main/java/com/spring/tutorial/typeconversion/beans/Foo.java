package com.spring.tutorial.typeconversion.beans;

import java.util.Date;

public class Foo {
	private String bar;

	private Date date;

	public Foo(String bar) {
		this.bar = bar;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
