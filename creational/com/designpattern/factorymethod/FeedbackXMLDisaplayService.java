package com.designpattern.factorymethod;

public class FeedbackXMLDisaplayService extends DisplayService {
	@Override
	protected XMLParser getParser() {
		return new FeedbackXMLParser();
	}
}
