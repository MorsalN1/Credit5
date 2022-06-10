package Buttonevents;
/*
Program: practise4      Date: june 8, 2022

Purpose: 
Challenge: Add the green button and create an event for the green button.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;

public class practise4 {
	public static void main(String[] args) throws Exception {

		// Create
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();

		// Address
		redButton.setIsHubPortDevice(true);
		redButton.setHubPort(0);
		greenButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);

		// Event
		redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent e) {
				System.out.println("State: " + e.getState());
			}

		});

		greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent e) {
				System.out.println("State: " + e.getState());
			}

		});

		// Open
		redButton.open(1000);
		greenButton.open(1000);

		// Keep program running
		while (true) {
			Thread.sleep(150);
		}
	}
}
/*
* Screen Dump
* 
*
*/