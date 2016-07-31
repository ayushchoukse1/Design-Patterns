package com.designpattern.bridge;

public class CentralLockingSystem implements Product{

	public String productName;
	
	public CentralLockingSystem(String productName) {
	this.productName=productName;
	}
	
	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Central Locking system being produced.");
	}

}
