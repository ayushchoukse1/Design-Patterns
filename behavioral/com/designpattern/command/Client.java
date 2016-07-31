package com.designpattern.command;

public class Client {
	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(10);

		for (int i = 0; i < 2; i++) {
			Command emailCommand = new EmailCommand(new Email());
			Command fileIOCommand = new FileIOCommand(new FileIO());
			Command loggingCommand = new LoggingCommand(new Logging());
			Command smsCommand = new SmsCommand(new Sms());

			pool.addCommand(emailCommand);
			pool.addCommand(smsCommand);
			pool.addCommand(loggingCommand);
			pool.addCommand(fileIOCommand);

		}
		pool.shutdown();
	}
}
