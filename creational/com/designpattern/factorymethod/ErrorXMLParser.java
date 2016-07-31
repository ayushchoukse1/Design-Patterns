package com.designpattern.factorymethod;

public class ErrorXMLParser implements XMLParser {

	@Override
	public String parse() {
		return "Parsing Error from XML";

	}
}
