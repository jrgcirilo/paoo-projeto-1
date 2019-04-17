package br.com.strategy.project.p1;

public class King extends Character {

	@Override
	public void fight() {
		 WeaponBehavior weapon = new AxeBehavior();
		 
		 weapon.useWeapon();
	}

}
