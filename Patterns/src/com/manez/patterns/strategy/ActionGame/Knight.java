package com.manez.patterns.strategy.ActionGame;

public class Knight extends Character {

	public Knight() {
		weaponSkill = new BowAndArrowSkill();
	}

	@Override
	protected void fight() {
		weaponSkill.useWeapon();

	}

}
