package com.designpattern.mediator;

public class MediatorClient {
	public static void main(String[] args) {
		Button button = new Button();
		Heater heater = new Heater();
		Machine machine = new Machine();
		Motor motor = new Motor();
		Valve valve = new Valve();
		SoilRemoval soilRemoval = new SoilRemoval();

		Mediator mediator = new CottonWasherMediator(button, heater, machine, motor, valve, soilRemoval);
		button.setMediator(mediator);
		heater.setMediator(mediator);
		machine.setMediator(mediator);
		motor.setMediator(mediator);
		valve.setMediator(mediator);
		soilRemoval.setMediator(mediator);

		mediator.start();

	}

}
