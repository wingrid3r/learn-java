package com.manez.patterns.strategy.ActionGame;

public class Queen extends Character {

	public Queen() {
		weaponSkill = new KnifeSkill();
	}

	@Override
	protected void fight() {
		weaponSkill.useWeapon();

	}

}
