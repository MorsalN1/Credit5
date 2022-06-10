package Lesson2;
/*
Program: practise3      Date: june 2, 2022

Purpose: 
Modify your code to only print when the button state changes.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;

public class practise3 {
	public static void main(String[] args) throws Exception {

		// Create
		DigitalInput redButton = new DigitalInput();

		// Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);

		// Open
		redButton.open(1000);

		// Use your Phidgets
		while (true) {
			if (redButton.getState() == true) {
				System.out.println("Button State: " + redButton.getState());
				Thread.sleep(150);
			}
		}
	}
}
/*
* Screen Dump
* 
*
*/