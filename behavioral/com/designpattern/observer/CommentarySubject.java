package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

public class CommentarySubject implements Commentary, Subject {

	private List<Observer> observerList;
	private String subjectDetails;
	private String desc;

	public CommentarySubject(String subjectDetails, List<Observer> observerList) {
		this.observerList = observerList;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void subscribeObserver(Observer observer) {
		System.out.println(subjectDetails+" : Adding new observer to the subscriber list: " + observer.getUserInfo());
		observerList.add(observer);
		System.out.println(subjectDetails+" : Added...");
	}

	@Override
	public void UnsubscribeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int position = observerList.indexOf(observer);
		observerList.remove(position);
		System.out.println(subjectDetails+": Removing " + observer.getUserInfo() + " Observer from subscribers list.");
	}

	@Override
	public void notifyObservers(String desc1) {
		for (Observer observer : observerList) {
			observer.update(desc1);
		}
	}

	@Override
	public String subjectDetail() {
		// TODO Auto-generated method stub
		return subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers(desc);
	}

}
