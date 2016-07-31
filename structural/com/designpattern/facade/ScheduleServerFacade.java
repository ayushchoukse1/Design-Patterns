package com.designpattern.facade;

public class ScheduleServerFacade {
	private final ScheduleServer scheduleServer;

	public ScheduleServerFacade(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}
	
	public void startServer() throws InterruptedException{
		scheduleServer.setDBConfig();
		scheduleServer.setServerConfig();
		scheduleServer.setAppConfig();
		scheduleServer.startDBServer();
		scheduleServer.start();
		scheduleServer.startingApplication();
	}
	
	public void stopServer() throws InterruptedException{
		scheduleServer.stop();
		
	}
}
