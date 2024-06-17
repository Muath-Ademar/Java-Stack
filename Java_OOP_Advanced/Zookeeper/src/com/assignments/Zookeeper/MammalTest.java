package com.assignments.Zookeeper;

public class MammalTest {
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		Bat bat = new Bat();
		// GorillaTest
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBannanas();
		gorilla.eatBannanas();
		gorilla.climb();
		gorilla.displayEnergy();
		// batTest
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		bat.fly();
		bat.displayBatEnergy();
	}
}
