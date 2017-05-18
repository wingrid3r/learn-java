package com.manez.patterns.strategy.ActionGame;

public class ActionGame {

	public static void main(String[] args) {
		Character king = new King();
		Character queen = new Queen();
		Character knight = new Knight();
		Character giant = new Troll();
		
		king.fight();
		queen.fight();
		knight.fight();
		giant.fight();
		
		king.aquireWeaponSkill(new BowAndArrowSkill());
		king.fight();
		queen.aquireWeaponSkill(new SwordSkill());
		queen.fight();
		knight.aquireWeaponSkill(new SwordSkill());
		knight.fight();
	}

}
