package com.designpattern.bridge;

public class GearLockingSystem implements Product {
	public String productName;

	public GearLockingSystem(String productName) {
		this.productName = productName;
	}

	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Gear Locking System is produced.");
	}

}
