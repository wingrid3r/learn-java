package com.manez.patterns.strategy.ActionGame;

public class Troll extends Character {

	public Troll() {
		weaponSkill = new AxeSkill();
	}

	@Override
	protected void fight() {
		weaponSkill.useWeapon();
	}

}
