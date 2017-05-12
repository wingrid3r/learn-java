package com.manez.patterns.strategy.Duck;

public class Silent implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("...No Sound...");

	}

}
