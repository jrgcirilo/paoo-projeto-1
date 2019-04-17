package br.com.strategy.project.p1;

public abstract class Character {
	WeaponBehavior Weapon;
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		Weapon = w;
	}
	public WeaponBehavior getWeapon() {
		return Weapon;
	}
	
}
