package com.designpattern.prototype;

public class Dog implements Animal {

	public Animal makeCopy() {
		Animal dog = null;
		try {
			dog = (Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dog;
	}

}
