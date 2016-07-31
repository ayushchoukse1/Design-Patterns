package com.designpattern.decorator;

public class Chicken extends PizzaDecorator{
	
	private final Pizza pizza;
	
	public Chicken(Pizza pizza){
		this.pizza=pizza;
	}
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+3.00;
	}
	
	public String getDescription(){
		return pizza.getDescription()+" + Chicken($3)";
	}
	
	
}
