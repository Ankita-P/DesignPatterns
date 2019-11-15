package com.designpatterns.structural.bridge;

public class Car extends Vehicle {

	protected Car(IWorkshop workShop1, IWorkshop workShop2) {
		super(workShop1, workShop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.print("Car "); 
        workShop1.work(); 
        workShop2.work(); 

	}

}
