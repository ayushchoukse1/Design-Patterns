package com.designpattern.mediator;

public class Button implements WasherCollegue {

	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void press(){
		System.out.println("Button Pressed.");
		mediator.start();
	}
}
