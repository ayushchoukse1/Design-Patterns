package com.designpattern.command;

public class SmsCommand implements Command{
	private Sms sms ;
	
	public SmsCommand(Sms sms) {
		this.sms = sms;
	}
	
	@Override
	public void execute() {
		System.out.println("Executing SMS Command.");
	}

}
