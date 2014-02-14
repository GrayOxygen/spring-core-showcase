package com.spring.tutorial.spel.expressiontemplating;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.tutorial.AbstractAppWithLog4jSupport;

public class App extends AbstractAppWithLog4jSupport {

	@Override
	protected void main() {
		ExpressionParser parser = new SpelExpressionParser();

		String randomPhrase = parser.parseExpression(
				"random number is #{T(java.lang.Math).random()}",
				new TemplateParserContext()).getValue(String.class);
		
		logInfo(randomPhrase);
	}

	public static void main(String[] args) {
		new App().main();
	}

}
