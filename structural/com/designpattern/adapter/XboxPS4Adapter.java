package com.designpattern.adapter;

public class XboxPS4Adapter implements PS4{
	Xbox xboxAdapter  = new XboxImpl();

	@Override
	public String pressedTriangle() {
		// TODO Auto-generated method stub
		return xboxAdapter.Ypressed();
	}

	@Override
	public String pressedSquare() {
		// TODO Auto-generated method stub
		return xboxAdapter.Xpressed();
	}

	@Override
	public String pressedX() {
		// TODO Auto-generated method stub
		return xboxAdapter.Apressed();
	}

	@Override
	public String pressedCircle() {
		// TODO Auto-generated method stub
		return xboxAdapter.Bpressed();
	}
}
