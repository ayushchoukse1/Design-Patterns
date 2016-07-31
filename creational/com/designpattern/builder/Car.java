package com.designpattern.builder;

public class Car {

	private String carType;
	private String power;
	private String engine;
	private String fueltype;
	private String bodyStyle;

	public Car(String carType) {
		this.carType = carType;
	}

	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}


	@Override
	public String toString() {
		return "Car [carType=" + carType + ", power=" + power + ", engine=" + engine + ", fueltype=" + fueltype
				+ ", bodyStyle=" + bodyStyle + "]";
	}
	
	

}
