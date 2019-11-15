package com.designpatterns.structural.bridge;

public class Bike extends Vehicle {

	protected Bike(IWorkshop workShop1, IWorkshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike "); 
        workShop1.work(); 
        workShop2.work(); 
	}

}
