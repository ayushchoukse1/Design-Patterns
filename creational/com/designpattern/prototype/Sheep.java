package com.designpattern.prototype;

public class Sheep implements Animal {

	public Animal makeCopy() {
		Animal sheep = null;
		try {
			sheep = (Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sheep;
	}

}
