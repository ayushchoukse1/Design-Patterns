package com.designpattern.decorator;

public class Tomatoes extends PizzaDecorator {

	private final Pizza pizza;

	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	public Double getPrice() {
		return pizza.getPrice() + 1.00;
	}

	public String getDescription() {
		return pizza.getDescription() + " + Tomatoes($1)";
	}
}
