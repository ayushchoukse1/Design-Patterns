package com.designpattern.observer;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Subject subject = new CommentarySubject("Commentary Subject", new ArrayList<Observer>());
		Observer observe_1 = new Email(subject, "observer_1");
		Commentary commentary = (Commentary) subject;
		commentary.setDesc("This is a new description.");
		observe_1.subscribe();
		commentary.setDesc("This is a new description.");
		commentary.setDesc("changing description");
		observe_1.unsubsrcibe();
	
	}
}