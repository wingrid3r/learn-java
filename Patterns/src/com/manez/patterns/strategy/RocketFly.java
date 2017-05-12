package com.manez.patterns.strategy;

public class RocketFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Rocket fly...");

	}

}