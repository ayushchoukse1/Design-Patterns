package com.designpattern.bridge;

public class Bentley implements Car {

	public Product product = null;
	public String carType;

	public Bentley(String carType, Product product) {
		this.product = product;
		this.carType = carType;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling product "+product.productName()+" for car "+carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		
	}

}
