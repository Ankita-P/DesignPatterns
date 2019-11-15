package com.designpatterns.structural.facade;

public class VegNonVegRestaurant implements IHotel {

	@Override
	public Menu getMenu() {
		Menu bothMenu = new Menu();
		bothMenu.menuItem1 = "vegetarian, non-vegetarian Apetizer";
		bothMenu.menuItem2 = "vegetarian, non-vegetarian Main Course";
		
		return bothMenu;
	}

}
