package com.designpattern.factorymethod;

public class Client {
	
	public static void main(String[] args){
		DisplayService service = new FeedbackXMLDisaplayService();
		service.display();
		DisplayService errorService = new ErrorXMLDisplayService();
		errorService.display();
	}

}
