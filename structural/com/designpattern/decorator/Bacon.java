package com.designpattern.decorator;

public class Bacon extends PizzaDecorator {
	private final Pizza pizza;

	public Bacon(Pizza pizza) {
		// TODO Auto-generat-ed constructor stub
		this.pizza = pizza;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 5.00;
	}

	public String getDescription() {
		return pizza.getDescription() + " + Bacon($5)";
	}

}
