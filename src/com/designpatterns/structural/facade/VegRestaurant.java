package com.designpatterns.structural.facade;

public class VegRestaurant implements IHotel {

	@Override
	public Menu getMenu() {
		Menu vegMenu = new Menu();
		vegMenu.menuItem1 = "vegetarian Apetizer";
		vegMenu.menuItem2 = "vegetarian Main Course";
		
		return vegMenu;
	}

}
