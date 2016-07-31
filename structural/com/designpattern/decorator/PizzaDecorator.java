package com.designpattern.decorator;

public abstract class PizzaDecorator implements Pizza {
	public String getDescription() {
		return "Toppings";
	};
}
