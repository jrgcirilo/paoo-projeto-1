package br.com.strategy.project.p1;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Cortar com a faca!!!");
	}

}
