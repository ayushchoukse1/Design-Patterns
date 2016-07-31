package com.designpattern.adapter;

public class PS4Impl implements PS4 {
	private String triangle = "triangle";
	private String square = "square";
	private String x = "x";
	private String circle = "circle";
	@Override
	public String pressedTriangle() {
		// TODO Auto-generated method stub
		return triangle;
	}

	@Override
	public String pressedSquare() {
		// TODO Auto-generated method stub
		return square;
	}

	@Override
	public String pressedX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String pressedCircle() {
		// TODO Auto-generated method stub
		return circle;
	}

}
