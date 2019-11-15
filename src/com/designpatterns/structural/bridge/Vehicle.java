package com.designpatterns.structural.bridge;

//abstraction in bridge pattern 
abstract class Vehicle { 
 protected IWorkshop workShop1; 
 protected IWorkshop workShop2; 

 protected Vehicle(IWorkshop workShop1, IWorkshop workShop2) 
 { 
     this.workShop1 = workShop1; 
     this.workShop2 = workShop2; 
 } 

 abstract public void manufacture(); 
} 
