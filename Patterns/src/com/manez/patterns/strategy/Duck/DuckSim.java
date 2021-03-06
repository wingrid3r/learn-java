package com.manez.patterns.strategy.Duck;

public class DuckSim {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck("Malli");
		mallard.display();
		mallard.swim();
		mallard.watchMeFly();
		mallard.makeSomeNoise();
		mallard.setFlyBehavior(new RocketFly());
		mallard.watchMeFly();
		
		Duck modelDuck = new ModelDuck("Dummy");
		modelDuck.display();
		modelDuck.swim();
		modelDuck.watchMeFly();
		modelDuck.makeSomeNoise();
		modelDuck.setFlyBehavior(new FlyWithWings());
		modelDuck.setQuackBehavior(new Quack());
		modelDuck.watchMeFly();
		modelDuck.makeSomeNoise();
	}

}
