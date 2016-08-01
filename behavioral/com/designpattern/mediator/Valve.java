package com.designpattern.mediator;

public class Valve implements WasherCollegue {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void open() {
		System.out.println("Valve has been opened.");
		mediator.close();
	}

	public void close() {
		System.out.println("Valve has been closed.");
		mediator.on();
	}
}
