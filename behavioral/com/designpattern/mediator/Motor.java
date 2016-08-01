package com.designpattern.mediator;

public class Motor implements WasherCollegue {

	private Mediator mediator;
	private int rpm = 0;

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	public void startMotor() {
		System.out.println("Motor Started.");

	}

	public void setRPMLevel(int n) {
		System.out.println("Motor's Set to " + n + " RPM");
		
		switch (n) {
		case 1:
			rpm = 700;
			break;
		case 2:
			rpm = 1200;
			break;
		case 3:
			rpm = 1500;
			break;
		default:
			break;
		}
	}
	
	public void rotateMotor(){
		System.out.println("Motor rotation at "+rpm+" RPM speed.");
	}

}
