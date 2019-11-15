package com.designpatterns.structural.adapter;

//concrete implementation of interface - IBird
public class Sparrow implements IBird {

	@Override
	public void fly() {
		System.out.println("flying!");
		
	}

	@Override
	public void makeSound() {
		System.out.println("making sound!");	
	}

}
