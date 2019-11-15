package com.designpatterns.structural.bridge;

public class Production implements IWorkshop {

	@Override
	public void work() {
		System.out.print("Produced"); 
	}

}
