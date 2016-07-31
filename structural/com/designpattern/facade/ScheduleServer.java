package com.designpattern.facade;

public class ScheduleServer {
	public void setDBConfig() {
		System.out.println("Setting Database Configuration");
	}
	public void setServerConfig() {
		System.out.println("Setting Server Configuration");
	}
	public void setAppConfig() {
		System.out.println("Setting Application Configuration");
	}
	
	public void startDBServer() {
		System.out.println("Starting Database Server");
	}
	public void startingApplication() {
		System.out.println("Starting Application Server");
	}
	public void start() throws InterruptedException {
		System.out.println("Starting Server...");
		Thread.sleep(1000);
		System.out.println("Server Started");
	}
	
	public void stop() throws InterruptedException {
		System.out.println("Stopping Server...");
		Thread.sleep(1000);
		System.out.println("Server Stopped");
	}
}
