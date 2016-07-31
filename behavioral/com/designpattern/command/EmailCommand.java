package com.designpattern.command;

public class EmailCommand implements Command {
	private Email email;

	 public EmailCommand(Email email) {
		this.email = email;
	}

	@Override
	public void execute() {
		System.out.println("Executing email command");
		email.sendEmail();
	}

}
