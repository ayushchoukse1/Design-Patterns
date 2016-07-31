package com.designpattern.factorymethod;

public abstract class DisplayService {
	protected abstract XMLParser getParser();
	public void display(){
		XMLParser parser = getParser();
		System.out.println(parser.parse());
	}
}
