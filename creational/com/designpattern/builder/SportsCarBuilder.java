package com.designpattern.builder;

public class SportsCarBuilder extends AbstractCarBuilder {
	private Car car = new Car("hatchback");

	@Override
	public Car getCar() {

		return car;
	}

	@Override
	public void buildPower() {
		car.setPower("600BHP");

	}

	@Override
	public void buildEngine() {
		car.setEngine("v6");

	}

	@Override
	public void buildFuelType() {
		car.setFueltype("petrol");

	}

	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 192.3,"
				+ " overall width (inches): 75.5, overall height (inches): 54.2, wheelbase (inches): 112.3,"
				+ " front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
	}

}
