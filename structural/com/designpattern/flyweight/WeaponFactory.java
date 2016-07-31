package com.designpattern.flyweight;

import java.util.HashMap;

public final class WeaponFactory {
	private static HashMap<String, Weapon> map = new HashMap<String, Weapon>();

	private WeaponFactory() {
		throw new Error("Cannot create new instance of this class.");
	}

	public static synchronized Weapon getWeapon(String weaponType) {
		Weapon weapon = map.get(weaponType);

		if (weapon == null) {
			switch (weaponType) {
			case "bomb":
				weapon = new Bomb();
				break;
			case "missle":
				weapon = new Missile();
				break;
			case "tank":
				weapon = new Tank();
				break;
			case "warship":
				weapon = new Warship();
				break;
			default:
				break;
			}
		}
		return weapon;
	}
}
