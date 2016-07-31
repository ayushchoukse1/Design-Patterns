package com.designpattern.bridge;

public class BridgeClient {
	public static void main(String[] args) {
		
		Car bmwx6 = new BMW(new CentralLockingSystem("High Tech Central system"), "Sedan: BMW X6");
		Car bmwx4 = new BMW(new GearLockingSystem("Gear system"), "Sedan: BMW X4");
		
		bmwx6.assemble();
		bmwx6.produceProduct();
		bmwx4.assemble();
	}
}
