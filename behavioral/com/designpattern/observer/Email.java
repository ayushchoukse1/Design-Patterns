package com.designpattern.observer;

public class Email implements Observer {
	private Subject subject;
	private String desc;
	private String userInfo;

	public Email(Subject subject, String userInfo) {
		if (subject == null) {
			throw new IllegalArgumentException("No Publisher found.");
		}
		this.subject = subject;
		this.userInfo = userInfo;
	}

	@Override
	public void update(String desc) {
		this.desc = desc;
		System.out.println("Update : " + desc + " for userInfo: " + userInfo);
	}

	@Override
	public void subscribe() {
		System.out.println(userInfo+ " : suscribing to : "+subject.subjectDetail());
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");

	}

	@Override
	public void unsubsrcibe() {
		System.out.println(userInfo+ " : unsuscribing from : "+subject.subjectDetail());
		this.subject.UnsubscribeObserver(this);
	}

	public String getUserInfo() {
		return userInfo;
	}
}
