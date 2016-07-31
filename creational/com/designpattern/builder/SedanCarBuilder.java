package com.designpattern.builder;

public class SedanCarBuilder extends AbstractCarBuilder {

	private Car car = new Car("Sedan");

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return car;
	}

	@Override
	public void buildPower() {
		car.setPower("572 BHP");
	}

	@Override
	public void buildEngine() {
		car.setEngine("v12");

	}

	@Override
	public void buildFuelType() {
		car.setFueltype("Diesel");

	}

	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 202.9, " +
                "overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9," +
                " front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
	}

}
