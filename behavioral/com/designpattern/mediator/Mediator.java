package com.designpattern.mediator;

public interface Mediator {
	public void setRules();

	public void start();

	public void wash();

	public void open();

	public void close();
	
	public void on();

	public void off();

	public void checkTemperature(int n);
}
