package com.designpatterns.structural.facade;

public class NonVegRestaurant implements IHotel {

	@Override
	public Menu getMenu() {
		Menu nonVegMenu = new Menu();
		nonVegMenu.menuItem1 = "Chicken Apetizer";
		nonVegMenu.menuItem2 = "Chicken Main Course";
		
		return nonVegMenu;
	}

}
