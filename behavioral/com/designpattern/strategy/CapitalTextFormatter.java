package com.designpattern.strategy;

public class CapitalTextFormatter implements TextFormat {

	@Override
	public String format(String string) {
		return string.toUpperCase();
	}

}
