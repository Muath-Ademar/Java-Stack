package com.assignment.Devices;

public class Device {
protected int battery = 100;


public void status() {
	if(this.battery <= 10) {
		System.out.println("battery critical");
	}
	else {
		System.out.println("battery levels are normal");
	}
	System.out.println("Battery remaining: " + this.battery);
	
}

}

