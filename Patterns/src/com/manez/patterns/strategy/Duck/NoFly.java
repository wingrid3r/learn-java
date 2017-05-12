package com.manez.patterns.strategy.Duck;

public class NoFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
