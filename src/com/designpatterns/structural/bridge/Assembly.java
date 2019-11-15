package com.designpatterns.structural.bridge;

public class Assembly implements IWorkshop {

	@Override
	public void work() {
		System.out.print(" And"); 
        System.out.println(" Assembled."); 
	}

}
