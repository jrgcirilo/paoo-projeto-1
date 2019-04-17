package br.com.strategy.project.p1;

public class Queen extends Character {

	@Override
	public void fight() {
		 
		 WeaponBehavior weapon = new BowAndArrowBehavior();
		 
		 weapon.useWeapon();

	}

}
