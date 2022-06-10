package TugOfWar;
/*
Program: tugofwar      Date: june 1, 2022

Purpose: 
//Create a two-player game that simulates a tug of war.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;


public class tugofwar {
	public static void main(String[] args) throws Exception {
		int i = 0;
		int k = 0;
		int l = 1;
		int m = 1;
		int s = 1;
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
//outputs the red button being pressed
		while (true) {
			if (redButton.getState() == true) {
				if (i <= 9) {
					System.out.println("R Button State: " + redButton.getState());
					i++;
					Thread.sleep(200);
				}
			}
			//outputs the green button being pressed
			if (greenButton.getState() == true) {
				if (k <= 9) {
					System.out.println("G Button State: " + greenButton.getState());
					k++;
					Thread.sleep(200);
				}
			}
// flashes both lights once when one person wins
			if (k == 10 || i == 10) {
				if (l < 2) {
					greenLED.setState(true);
					Thread.sleep(50);
					greenLED.setState(false);
					Thread.sleep(50);
					redLED.setState(true);
					Thread.sleep(50);
					redLED.setState(false);
					Thread.sleep(50);
					l++;

				}

			}
// flashes green light 5 times if its the winner
			if (k == 10 && s < 6) {
				greenLED.setState(true);
				Thread.sleep(50);
				greenLED.setState(false);
				Thread.sleep(50);
				s++;

			}
			//flashes the red light 5 times if its the winner
			if (i == 10 && m < 6) {
				redLED.setState(true);
				Thread.sleep(50);
				redLED.setState(false);
				Thread.sleep(50);
				m++;

			}

		}

	}
}
/*
* Screen Dump
* 
*
*/