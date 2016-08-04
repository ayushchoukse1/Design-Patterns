package com.designpattern.observer;

public interface Subject {
	public void subscribeObserver(Observer observer);

	public void UnsubscribeObserver(Observer observer);

	public void notifyObservers(String desc1);

	public String subjectDetail();

}
