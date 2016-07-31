package com.designpattern.builder;

public class Client {

	public static void main(String[] args) {
		AbstractCarBuilder carBuilder = new SedanCarBuilder();
		CarBuildingDirector director = new CarBuildingDirector(carBuilder);
		carBuilder = director.build();
		System.out.println(carBuilder.getCar().toString());
		
		AbstractCarBuilder SportsCarBuilder = new SportsCarBuilder();
		CarBuildingDirector director2 = new CarBuildingDirector(SportsCarBuilder);
		carBuilder = director2.build();
		System.out.println(SportsCarBuilder.getCar().toString());
	}

}
