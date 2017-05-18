package com.manez.patterns.strategy.ActionGame;

public class AxeSkill implements WeaponSkill {

	@Override
	public void useWeapon() {
		System.out.println("Chop-Chop");
	}

}
