package twoormoresmartphidgets;
/*
Program: practise1      Date: june 8, 2022

Purpose: 
Modify your code so when you press the red button the
temperature from temperatureSensor0 prints and when you press the green 
button the temperature from temperatureSensor1 prints.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.TemperatureSensor;

public class practise1 {
	public static void main(String[] args) throws Exception {

		// Create
		TemperatureSensor temperatureSensor0 = new TemperatureSensor();
		TemperatureSensor temperatureSensor1 = new TemperatureSensor();
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();

		// Address
		temperatureSensor0.setHubPort(3);
		temperatureSensor1.setHubPort(2);

		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);

		// Open
		redButton.open(1000);
		greenButton.open(1000);

		// Open
		temperatureSensor0.open(1000);
		temperatureSensor1.open(1000);

		// Use your Phidgets
		while (true) {
			//red button display the temperature of sensor0
			if (redButton.getState() == true) {
				System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C");
				Thread.sleep(250);
			}
//green button display the temperature of sensor1
			else if (greenButton.getState() == true) {
				System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C");
				Thread.sleep(250);
			}

		}
	}
}
