package com.designpattern.composite;

import java.util.ArrayList;

public class CompositeClient {
	public static void main(String[] args) {
		Component leaf1 = new Leaf("leaf-1", "1000", "leaf");
		Component leaf2 = new Leaf("leaf-2", "1100", "leaf");
		Component leaf3 = new Leaf("leaf-3", "1200", "leaf");
		Component leaf4 = new Leaf("leaf-4", "1300", "leaf");
		Component leaf5 = new Leaf("leaf-5", "1400", "leaf");
		Component leaf6 = new Leaf("leaf-6", "1500", "leaf");
		Component leaf7 = new Leaf("leaf-7", "1600", "leaf");
		Component leaf8 = new Leaf("leaf-8", "1700", "leaf");

		Component composite1 = new Composite("Composite-1", "100000", "Composite", new ArrayList<Component>());
		composite1.addComponent(leaf1);
		composite1.addComponent(leaf2);
		composite1.addComponent(leaf3);
		Component composite2 = new Composite("Composite-2", "130000", "Composite", new ArrayList<Component>());
		composite2.addComponent(leaf5);
		composite2.addComponent(leaf6);
		composite2.addComponent(leaf8);

		Component mainComposite = new Composite("Main Composite", "100000000", "Composite", new ArrayList<Component>());
		mainComposite.addComponent(composite1);
		mainComposite.addComponent(leaf4);
		mainComposite.addComponent(leaf7);
		mainComposite.addComponent(composite2);

		System.out.println(mainComposite.toString());
		System.out.println(composite1.toString());
		System.out.println(composite2.toString());
		
	}
}
