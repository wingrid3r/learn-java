package com.manez.patterns.strategy.ActionGame;

public abstract class Character {
	//String name;
	WeaponSkill weaponSkill;
	protected abstract void fight();
	protected void aquireWeaponSkill(WeaponSkill ws){
		this.weaponSkill = ws;
	}
	

}
