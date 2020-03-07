package com.designpattern.adapter;

public class Client {

	public static void main(String[] args) {
		PS4 ps = new PS4Impl();
		Xbox xbox = new XboxImpl();
		System.out.println("ps4: " + ps.pressedCircle() + "  ==== xbox: " + xbox.Ypressed());
		XboxPS4Adapter adapter = new XboxPS4Adapter();
		System.out.println("Adapter: Circle:" + adapter.pressedCircle() + "\nsquare: " + adapter.pressedSquare()
				+ "\ntriangle: " + adapter.pressedTriangle() + "\nx: " + adapter.pressedX());
	}
}
