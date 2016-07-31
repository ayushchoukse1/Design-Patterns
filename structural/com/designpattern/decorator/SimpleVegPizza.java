package com.designpattern.decorator;

public class SimpleVegPizza implements Pizza{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "SimpleVegPizza ($10)";
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 10.00;
	}

}
