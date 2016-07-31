package com.designpattern.facade;

public class ServerApplication {
	public static void main(String[] args) throws InterruptedException {

	/*	// Without Facade Class, we have to do below steps everytime we have to
		// start/stop the server.
		ScheduleServer server = new ScheduleServer();
		server.setDBConfig();
		server.setServerConfig();
		server.setAppConfig();
		server.startDBServer();
		server.start();
		server.startingApplication();
		*/
		
		//With ScheduleServerFacade Class.
		
		 new ScheduleServerFacade(new ScheduleServer()).startServer();;
		
	}
}
