package com.designpatterns.structural.adapter;


//Implementation of Adapter Design Pattern
public class BirdAdapter implements IToyDuck {

	//Reference of IBird Interface
	IBird bird;
	
	public BirdAdapter(IBird iBird) {
		this.bird = iBird;
	}
	
	//Implementing method from IToyDock Interface, calling method from IBird interface
	@Override
	public void squeak() {
		this.bird.makeSound();

	}

}
