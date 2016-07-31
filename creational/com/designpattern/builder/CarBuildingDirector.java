package com.designpattern.builder;

public class CarBuildingDirector {

	private AbstractCarBuilder carBuilder;

	public CarBuildingDirector(AbstractCarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public AbstractCarBuilder build(){
		carBuilder.buildBodyStyle();
		carBuilder.buildEngine();
		carBuilder.buildFuelType();
		carBuilder.buildPower();
		return carBuilder;
	}
}
