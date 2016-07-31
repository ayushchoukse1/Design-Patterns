package com.designpattern.prototype;

public class CloneFactory {
	
	Animal animal = null;
	public CloneFactory(Animal animal){
		this.animal=animal;
	}
	
	public Animal getClone(){
		return animal.makeCopy();
	}

}
