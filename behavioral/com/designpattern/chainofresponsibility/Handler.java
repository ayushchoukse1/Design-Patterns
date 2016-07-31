package com.designpattern.chainofresponsibility;

public abstract class Handler {
	
	//Holding reference for the next handler.
	protected Handler nextHandler;
	
	//Setting the next handler.
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void handleFile(File file);
	public abstract String getName();
}
