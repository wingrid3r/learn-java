package com.manez.patterns.strategy.Duck;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Wings - fap! fap!");
	}

}
