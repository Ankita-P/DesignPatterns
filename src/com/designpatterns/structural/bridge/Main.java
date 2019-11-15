package com.designpatterns.structural.bridge;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Production(), new Assembly()); 
        vehicle1.manufacture(); 
        Vehicle vehicle2 = new Bike(new Production(), new Assembly()); 
        vehicle2.manufacture(); 
	}

}
