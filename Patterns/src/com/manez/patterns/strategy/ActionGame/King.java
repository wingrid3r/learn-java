package com.manez.patterns.strategy.ActionGame;

public class King extends Character {

	public King() {
		weaponSkill = new SwordSkill();
	}

	@Override
	protected void fight() {
		weaponSkill.useWeapon();

	}

}
