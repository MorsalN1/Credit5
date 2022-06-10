package Lesson3;
/*
Program: practise3      Date: may 24, 2022

Purpose: 
Modify your code to the count the total number of button presses. (Hint: Make sure you have completed Lesson 2, Practice Question 3).

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class practise3 {
	public static void main(String[] args) throws Exception {

		// Create
		int i = 0;
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();

		// Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);

		// Open
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);

		// Use your Phidgets
		//continuously runs the program
		while (true) {

			//i increases by 1 everytime the red button is pressed
			if (redButton.getState() == true) {
				redLED.setState(true);
				i++;
				System.out.println(i);
			} else {
				redLED.setState(false);
			}
			// i increases by 1 everytime the green button is pressed
			if (greenButton.getState() == true) {
				greenLED.setState(true);
				i++;
				System.out.println(i);
			} else {
				greenLED.setState(false);
			}

			Thread.sleep(150);
		}
	}
}
/*
* Screen Dump
* 
*
*/
