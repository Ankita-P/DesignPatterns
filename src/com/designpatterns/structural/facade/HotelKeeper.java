package com.designpatterns.structural.facade;

/*
 * Implementation of Facade design pattern
 * Combining 3 classes using the same interface into a single class.
 * Now the user does not have to reference 3 different classes to access the type of menus. He will get all 3 by referencing one class only.
 */
public class HotelKeeper {

	public Menu getVegetarianMenu()
	{
		VegRestaurant vegRestaurant = new VegRestaurant();
		Menu vegMenu = vegRestaurant.getMenu();
		
		return vegMenu;
	}
	
	public Menu getNonVegetarianMenu()
	{
		NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
		Menu nonVegMenu = nonVegRestaurant.getMenu();
		
		return nonVegMenu;
	}
	
	public Menu getBothMenu()
	{
		VegNonVegRestaurant vegNonVegRestaurant = new VegNonVegRestaurant();
		Menu vegNonVegMenu = vegNonVegRestaurant.getMenu();
		
		return vegNonVegMenu;
	}
}
