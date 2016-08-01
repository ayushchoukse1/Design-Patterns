package com.designpattern.mediator;

public class SoilRemoval implements WasherCollegue{
	
	private Mediator mediator;
	public void low() {
		System.out.println("Soil Removal Kept to low.");
	}

	public void med() {
		System.out.println("Soil Removal Kept to Medium");
	}

	public void high() {
		System.out.println("Soil Removal Kept to High.");
	}

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}
}
