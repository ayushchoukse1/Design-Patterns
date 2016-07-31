package com.designpattern.command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	private BlockingQueue<Command> queue;
	private Thread[] threads;
	private volatile boolean shutdown;

	public ThreadPool(int n) {
		queue = new LinkedBlockingQueue<Command>(n);
		threads = new Thread[n];
		for (int i = 0; i < n; i++) {
			threads[i] = new Worker();
			threads[i].start();
		}
	}

	public void addCommand(Command command) {
		queue.add(command);
	}

	public void shutdown() {
		if (!queue.isEmpty()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		shutdown = true;
		for (Thread thread : threads) {
			thread.interrupt();
		}
	}

	private class Worker extends Thread {
		private Command command;

		public void run() {

			while (!shutdown) {
				try {
					command = queue.take();
					command.execute();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
