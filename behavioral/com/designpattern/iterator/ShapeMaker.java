package com.designpattern.iterator;

public class ShapeMaker {
	private int count;
	private Shape[] shapes;

	public ShapeMaker(int n) {

		shapes = new Shape[n];
	}

	public void createShape(String name) {
		count++;
		shapes[count] = new Shape(count, name);
	}

	public Shape[] getShapes() {
		return shapes;
	}
}
