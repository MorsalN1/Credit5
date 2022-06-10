package ButtonLEDevents;
/*
Program: practise3      Date: june 8, 2022

Purpose: 
Modify your code to count the total number of button presses.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;
import com.phidget22.DigitalOutput;

public class practise3 {
	static boolean turnRedLEDOn = false;
	static boolean turnGreenLEDOn = false;

	// Handle Exceptions
	public static void main(String[] args) throws Exception {

		int i = 0;
		// Create
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();

		// Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);

		// Event
		redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent e) {
				// Record button state to turn on/off the red LED
				turnRedLEDOn = e.getState();
			}
		});

		// Event
		greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
			public void onStateChange(DigitalInputStateChangeEvent e) {
				// Record button state to turn on/off the green LED
				turnGreenLEDOn = e.getState();
			}
		});

		// Open
		redLED.open(1000);
		greenLED.open(1000);
		redButton.open(1000);
		greenButton.open(1000);

		// Use your Phidgets
		while (true) {
			// turn red LED on based on red button input
			if (redButton.getState() == true) {
				redLED.setState(turnRedLEDOn);
				i++;
				System.out.println(i);
				Thread.sleep(150);
			}
			// turn green LED on based on green button input
			if (greenButton.getState() == true) {
				greenLED.setState(turnGreenLEDOn);
				i++;
				System.out.println(i);
				Thread.sleep(150);
			}
			// sleep for 150 milliseconds
			
		}
	}
}
/*
* Screen Dump
* 
*
*/