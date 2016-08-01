package com.designpattern.iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape> {

	private ShapeMaker maker;
	private Shape[] shapes;
	private int count;
	public ShapeIterator(ShapeMaker maker) {
		this.maker = maker;
		shapes = maker.getShapes();
	}

	@Override
	public boolean hasNext() {
		if (shapes.length == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Shape next() {
		count++;
		return shapes[count];
	}

}
