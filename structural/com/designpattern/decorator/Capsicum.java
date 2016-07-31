package com.designpattern.decorator;

public class Capsicum extends PizzaDecorator {

	private final Pizza pizza;

	public Capsicum(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 2.00;
	}

	public String getDescription() {
		return pizza.getDescription() + "  + Capsicum($2)";
	}

}
