package com.designpattern.flyweight;

public class WeaponClient {
	public static void main(String[] args) {
		Weapon bomb = WeaponFactory.getWeapon("bomb");
		bomb.displayInfo();
		Weapon tank = WeaponFactory.getWeapon("tank");
		tank.displayInfo();
		Weapon warship = WeaponFactory.getWeapon("warship");
		warship.displayInfo();
		Weapon Missile = WeaponFactory.getWeapon("missile");
		warship.displayInfo();
		
		
		Weapon bomb2 = WeaponFactory.getWeapon("bomb");
		bomb2.displayInfo();
		Weapon tank2 = WeaponFactory.getWeapon("tank");
		tank2.displayInfo();
		Weapon warship2 = WeaponFactory.getWeapon("warship");
		warship2.displayInfo();
		Weapon Missile2 = WeaponFactory.getWeapon("missile");
		warship2.displayInfo();
	}
}
