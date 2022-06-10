package HotorCold;
/*
Program: hotorcold      Date: june 2, 2022

Purpose: 
Create a temperature indicator using your Smart Phidget and LEDs.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class hotorcold {
	public static void main(String[] args) throws Exception {

        
		// Create
		HumiditySensor humiditySensor = new HumiditySensor();
		TemperatureSensor temperatureSensor = new TemperatureSensor();

		// Open
		humiditySensor.open(1000);
		temperatureSensor.open(1000);
		

		DigitalOutput greenLED = new DigitalOutput();
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		greenLED.open(1000);
		DigitalOutput redLED = new DigitalOutput();
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);
        

		if(true) {
			//checks if the temperature is between 20-24
			if (24 > temperatureSensor.getTemperature() && temperatureSensor.getTemperature() > 20) {
				//outputs temperature 
				System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
				 while(true){
					 // turns the green LED on if is
					 greenLED.setState(true);
			         
			           
				 }
				
			} else {
				//turn the red led if the temperature is not in the range
				System.out.println("the room is to cold");
				Thread.sleep(150);
				while(true){
					 redLED.setState(true);
			}
		}
	}
	}
}
/*
* Screen Dump
* 
*
*/