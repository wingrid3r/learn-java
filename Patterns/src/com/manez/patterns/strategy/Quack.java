package com.manez.patterns.strategy;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack... Quack....");
	}

}
