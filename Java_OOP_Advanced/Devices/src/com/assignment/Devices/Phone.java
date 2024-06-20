package com.assignment.Devices;

public class Phone extends Device {
	

	

	public void makeCall() {
		System.out.println(" <-------------calling------------->  " );
		battery -= 5;
		status();
		
	}
	public void playGame() {
		if (this.battery<25) {
			System.out.println(" the battery is too low for playing  games  " );
			return;

		}
		else {
		System.out.println(" <-------------Playing a game------------->  " );
		battery -= 20;
		status();
		}

	}
	public void charge() {
		System.out.println(" <-------------charging------------->  " );
		battery += 50;
		status();

	}
}