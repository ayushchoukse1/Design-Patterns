package com.designpattern.mediator;

public class CottonWasherMediator implements Mediator {

	private Button button;
	private Heater heater;
	private Machine machine;
	private Motor motor;
	private Valve valve;
	private SoilRemoval soilRemoval;
	
	public CottonWasherMediator(Button button, Heater heater, Machine machine, Motor motor, Valve valve,SoilRemoval soilRemoval) {
		super();
		this.button = button;
		this.heater = heater;
		this.machine = machine;
		this.motor = motor;
		this.valve = valve;
		this.soilRemoval = soilRemoval;
	}

	@Override
	public void setRules() {

	}

	@Override
	public void start() {
		machine.start();
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		motor.startMotor();
		motor.setRPMLevel(2);
		motor.rotateMotor();
		System.out.println("Adding detergent to Machine.");
		soilRemoval.low();
		System.out.println("Adding Softener to the machine.");
	}

	@Override
	public void open() {
		valve.open();

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		valve.close();
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		heater.on(25);
	}

	@Override
	public void off() {
		heater.off();
	}

	@Override
	public void checkTemperature(int n) {
		heater.checkTemperature(n);
	}

}
