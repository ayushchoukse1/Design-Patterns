package com.designpattern.strategy;

public class LowerTextFormatter implements TextFormat {

	@Override
	public String format(String string) {
		return string.toLowerCase();
	}

}
