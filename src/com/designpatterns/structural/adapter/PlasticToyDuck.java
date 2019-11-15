package com.designpatterns.structural.adapter;

//concrete implementation of interface - IToyDuck
public class PlasticToyDuck implements IToyDuck {

	@Override
	public void squeak() {
		System.out.println("Squeak!");

	}

}
