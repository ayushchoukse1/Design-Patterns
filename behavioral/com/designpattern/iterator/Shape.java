package com.designpattern.iterator;

public class Shape {
	private int side;
	private String name;

	public Shape(int side,String name) {
		this.side = side;
		this.name = name;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
