package com.designpattern.iterator;

import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker(6);
		maker.createShape("line");
		maker.createShape("double line");
		maker.createShape("triangle");
		maker.createShape("quadilateral");
		maker.createShape("pentagon");
		
		ShapeIterator iterator = new ShapeIterator(maker);
		for (Iterator<Shape> iterator2 = iterator; iterator2.hasNext();) {
			Shape shape = iterator.next();
			System.out.println("name: "+shape.getName()+ " side :"+shape.getSide());
			
		}
	}
}
