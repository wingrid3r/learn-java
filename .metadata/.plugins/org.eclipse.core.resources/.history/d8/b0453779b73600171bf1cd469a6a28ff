package com.manez.patterns.strategy;

public abstract class Duck {
	String name;
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public Duck(String name) {
		super();
		this.name = name;
	}

	public abstract  void display();

	public void watchMeFly(){
		flyBehavior.fly();
	}
	
	

	protected void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
	protected void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void makeSomeNoise(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("Swim/Float");
	}
}
