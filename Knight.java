package br.com.strategy.project.p1;

public class Knight extends Character {

	@Override
	public void fight() {
		
		 WeaponBehavior weapon = new KnifeBehavior();
		 
		 weapon.useWeapon();

	}

}
