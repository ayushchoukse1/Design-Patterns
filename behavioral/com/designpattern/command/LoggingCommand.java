package com.designpattern.command;

public class LoggingCommand implements Command {
	private Logging logging;

	public LoggingCommand(Logging logging) {
		this.logging = logging;
	}

	@Override
	public void execute() {
		System.out.println("Executing Logging Command");
		logging.logMessage();
	}

}
