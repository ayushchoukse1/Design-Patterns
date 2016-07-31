package com.designpattern.bridge;

public class BMW implements Car {
	public Product product;
	public String carType;
	
	public BMW(Product product,String carType){
		this.carType=carType;
		this.product=product;
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Assembling product "+product.productName()+" for car "+carType);
	}

	@Override
	public void produceProduct() {
		// TODO Auto-generated method stub
		product.produce();
	}

}
