package com.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Singleton instance made 'volatile' to make sure that the changes to
	// a variable will be published only a change is complete. IF thread-1 is
	// creating an
	// object then thread-2 cannot make see the new object untill its entirely
	// created by thread-1.

	private static volatile Singleton instance ;

	private Singleton() {
		// To avoid creation of new instance from reflection.
		if (instance != null) {
			throw new RuntimeException("Cannot create, please use newInstance() method");
		}
		System.out.println("Instance of this Singleton Class is created: " + instance);
	}

	public static Singleton getInstance() {
		if (instance == null) {
			// Double Check Locking- to avoid multi-threaded access to singleton
			// class.
			synchronized (Singleton.class) {
				if (instance == null) {
					System.out.println("Double checked locking");
					instance = new Singleton();
					System.out.println("First Instance created: " + instance);
				}
			}
		}
		return instance;
	}

	// To avoid serialization and deserialization.
	public Object readResolve() {
		System.out.println("Read Resolve");
		return getInstance();
	}
}
