package com.designpattern.mediator;

public class Machine implements WasherCollegue {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void start() {
		System.out.println("Starting the machine");
		mediator.open();
	}

}
