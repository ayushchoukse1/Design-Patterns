package com.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("s1= " + s1 + "\n s2= " + s2);
		/*
				// Reflection
				Class clazz = Class.forName("com.designpattern.singleton.Singleton");
				Constructor<Singleton> con = clazz.getDeclaredConstructor();
				con.setAccessible(true);
				Singleton s4 = con.newInstance();
				System.out.println(s4);
		*/
		
		/*
		// Serialization
		System.out.println("using serialization and deserialization");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Ayush/temp.txt"));
		oos.writeObject(s2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Ayush/temp.txt"));
		Singleton s5 = (Singleton) ois.readObject();
		System.out.println("s5: " + s5);
		
		*/	}
}
