package com.designpattern.prototype;

public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep();
		CloneFactory cf = new CloneFactory(sheep);
		Sheep sheep2  = (Sheep)cf.getClone();
		System.out.println(sheep);
		System.out.println( sheep2); 
		
		Dog dog = new Dog();
		CloneFactory cf1= new CloneFactory(dog);
		Dog dogClone = (Dog)cf1.getClone();
		
		System.out.println(dog);
		System.out.println(dogClone);
	}

}
