package com.designpatterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		IToyDuck iToyDuck = new PlasticToyDuck();
		
		
		//connects 2 non interactable interfaces
		BirdAdapter adapter = new BirdAdapter(sparrow);
		
		System.out.println("Bird is - ");
		sparrow.fly();
		sparrow.makeSound();
		
		System.out.println("ToyDuck is -");
		iToyDuck.squeak();
		
		System.out.println("Making the bird squeak - ");
		adapter.squeak();
	}

}
