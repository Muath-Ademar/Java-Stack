package com.assignments.Zookeeper;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("<----------The Gorila has thrown something---------->");
		this.energy -=5;
	}
	public void eatBannanas() {
		System.out.println("<----------The Gorila is eating---------->");
		this.energy += 10;

	}
	
	public void climb() {
		System.out.println("<----------The Gorila is climbing---------->");
		this.energy -= 10;	
		
	}
	
}
