package com.designpatterns.structural.facade;

/*
 * This class demonstrates use of Facade Pattern.
 * The customer calls a single class to access 3 different classes accessing an interface.
 * The number of interfaces can vary. 3 classes can use 3 different interfaces as well. 
 * But with facade pattern, we can now access all of them using a single class
 */
public class Customer {

	public static void main(String[] args) {
		HotelKeeper hotelKeeper = new HotelKeeper();
		
		Menu vegMenu = hotelKeeper.getVegetarianMenu();
		System.out.println("Vegetarian Menu - ");
		System.out.println(vegMenu.menuItem1);
		System.out.println(vegMenu.menuItem2);
		System.out.println(vegMenu.menuItem3);
		System.out.println(vegMenu.menuItem4);

		Menu nonVegMenu = hotelKeeper.getNonVegetarianMenu();
		System.out.println("Non-Vegetarian Menu - ");
		System.out.println(nonVegMenu.menuItem1);
		System.out.println(nonVegMenu.menuItem2);
		System.out.println(nonVegMenu.menuItem3);
		System.out.println(nonVegMenu.menuItem4);
		
		Menu vegNonVegMenu = hotelKeeper.getBothMenu();
		System.out.println("Vegetarian and Non-Vegetarian Menu - ");
		System.out.println(vegNonVegMenu.menuItem1);
		System.out.println(vegNonVegMenu.menuItem2);
		System.out.println(vegNonVegMenu.menuItem3);
		System.out.println(vegNonVegMenu.menuItem4);

	}

}
