package br.com.strategy.project.p1;

public class Troll extends Character {

	@Override
	public void fight() {
		
		 WeaponBehavior weapon = new SwordBehavior();
		 
		 weapon.useWeapon();

	}

}
