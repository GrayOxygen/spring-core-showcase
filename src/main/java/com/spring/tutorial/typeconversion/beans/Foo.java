package com.spring.tutorial.typeconversion.beans;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;
import static org.springframework.format.annotation.NumberFormat.*;

public class Foo {
	private String bar;

	private Date date;
        
        @NumberFormat(style = Style.CURRENCY)
        private BigDecimal decimal;

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
        
        public BigDecimal getDecimal(){
            return decimal;
        }
        
        public void setDecimal(BigDecimal decimal){
            this.decimal = decimal;
        }
}
