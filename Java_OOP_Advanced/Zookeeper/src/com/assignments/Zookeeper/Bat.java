package com.assignments.Zookeeper;

public class Bat extends Mammal{

public void fly() {
	System.out.println("<----------the Bat is currently airbourne---------->");
	this.batEnergy -=50;
}
public void eatHumans()  {
	System.out.println("<----------the Bat is eating a human!!!!!!!---------->");
	this.batEnergy +=25;
	
}
public void attackTown() {
	System.out.println("<----------the Bat is destroying the town!!!!!!!---------->");
	this.batEnergy -=100;
	

}
}
