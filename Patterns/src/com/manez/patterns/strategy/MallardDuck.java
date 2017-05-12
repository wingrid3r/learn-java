package com.manez.patterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		super(name);
		flyBehavior = new FlyWithWings();
		quackBehavior = new Squeak();
	}
	
	

	@Override
	public void display() {
		System.out.println("Name is " + name);

	}

}
