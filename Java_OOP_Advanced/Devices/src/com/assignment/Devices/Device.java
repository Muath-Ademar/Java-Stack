package com.assignment.Devices;

public class Device {
protected int battery = 100;


public void status() {
	if(this.battery<= 0){
		System.out.println(" out of battery ");
		return;
	}
	else if(this.battery <= 10) {
		System.out.println("battery critical");
	}
	else if (this.battery >= 100) {
		System.out.println("fully charged");
		return;
	}
	else {
		System.out.println("battery levels are normal");
	}
	
			System.out.println("Battery remaining: " + this.battery);

	}
	
}



