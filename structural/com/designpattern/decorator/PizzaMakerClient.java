package com.designpattern.decorator;

public class PizzaMakerClient {
	public static void main(String[] args) {

		Pizza veg = new SimpleVegPizza();
		System.out.println(veg.getDescription() + " = $" + veg.getPrice());

		Pizza nonveg = new SimpleNonVegPizza();
		System.out.println(nonveg.getDescription() + " = $" + nonveg.getPrice());

		// With 1st topping added
		nonveg = new Chicken(nonveg);
		System.out.println(nonveg.getDescription() + " = $" + nonveg.getPrice());

		// With 2nd Topping added.
		nonveg = new Tomatoes(nonveg);
		System.out.println(nonveg.getDescription() + " = $" + nonveg.getPrice());

		/*
		// With 2nd Topping added again.
		nonveg = new Tomatoes(nonveg);
		System.out.println(nonveg.getDescription() + " = " + nonveg.getPrice());
		*/
		
		//with all the toppings added
		nonveg = new Capsicum(nonveg);
		nonveg = new Cheese(nonveg);
		nonveg = new Bacon(nonveg);
		System.out.println(nonveg.getDescription() + " = $" + nonveg.getPrice());
	}
}
