package com.designpattern.observer;

public interface Observer {
	public void update(String string);

	public void subscribe();

	public void unsubsrcibe();

	public String getUserInfo();
}
