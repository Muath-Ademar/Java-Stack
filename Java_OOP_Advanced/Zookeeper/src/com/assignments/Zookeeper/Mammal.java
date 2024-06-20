package com.assignments.Zookeeper;

public class Mammal {
protected int energy = 100;




public int displayEnergy() {
	 if (this.energy <= 0) {
	System.out.println("fully exhausted");
	return this.energy;
}
	else {
			System.out.println("energy is at: " + this.energy);
			return this.energy;
	}
	

	
}

}
