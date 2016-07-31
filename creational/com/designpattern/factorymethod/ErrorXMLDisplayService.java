package com.designpattern.factorymethod;

public class ErrorXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
