package com.designpattern.builder;

public abstract class AbstractCarBuilder {
	/*
	private String carType;
	private String power;
	private String engine;
	private String fueltype;
	private String bodyStyle;
	*/
	public abstract Car getCar();
	public abstract void buildPower();
	public abstract void buildEngine();
	public abstract void buildFuelType();
	public abstract void buildBodyStyle();
	

}
