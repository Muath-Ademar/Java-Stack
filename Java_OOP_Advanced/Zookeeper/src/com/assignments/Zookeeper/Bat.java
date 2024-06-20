package com.assignments.Zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		this.energy = 300;
	}

public void fly() {
	System.out.println("<----------the Bat is currently airbourne---------->");
	this.energy -=50;
	displayEnergy();
}
public void eatHumans()  {
	System.out.println("<----------the Bat is eating a human!!!!!!!---------->");
	this.energy +=25;
	displayEnergy();
	
}
public void attackTown() {
	System.out.println("<----------the Bat is destroying the town!!!!!!!---------->");
	this.energy -=100;
	displayEnergy();
	

}
}
