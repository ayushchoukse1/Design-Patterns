package com.designpattern.decorator;

public class SimpleNonVegPizza implements Pizza{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "SimpleNonVegPizza ($15)";
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 15.00;
	}

}
