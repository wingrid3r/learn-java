package com.manez.patterns.strategy;

public class ModelDuck extends Duck {

	public ModelDuck(String name) {
		super(name);
		flyBehavior = new NoFly();
		quackBehavior = new Silent();
	}

	@Override
	public void display() {
		System.out.println("I am a model duck with name " + name);

	}

}
