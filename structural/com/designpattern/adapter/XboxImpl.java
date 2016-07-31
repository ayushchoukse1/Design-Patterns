package com.designpattern.adapter;

public class XboxImpl implements Xbox{
	
	private String y="y";
	private String x="x";
	private String a="a";
	private String b="b";

	@Override
	public String Ypressed() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public String Xpressed() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String Apressed() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public String Bpressed() {
		// TODO Auto-generated method stub
		return b;
	}

}
