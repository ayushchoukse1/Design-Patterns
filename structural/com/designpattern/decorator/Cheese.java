package com.designpattern.decorator;

public class Cheese extends PizzaDecorator {

	private final Pizza pizza;

	public Cheese(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}

	@Override
	public Double getPrice() {

		return pizza.getPrice() + 3.50;
	}
	
	public String getDescription(){
		return pizza.getDescription()+" + Cheese($3.5)";
	}
}
