package com.designpattern.mediator;

public class Heater implements WasherCollegue {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	public void on(int n) {
		System.out.println("Heater is on.");
		if (checkTemperature(n)) {
			System.out.println("Heater turned on at " + n + " degree celcius.");
			mediator.off();
		}
		
	}

	public boolean checkTemperature(int n) {
		if (n < 30) {
			return true;
		} else {
			return false;
		}
	}

	public void off() {
		System.out.println("Heater turned off.");
		mediator.wash();
	}

}
