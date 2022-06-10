package Buildathermostat;
/*
Program: buildthermostat      Date: june 2, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that gets data from a temperature sensor!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class buildthermostat {
	public static void main(String[] args) throws Exception {

		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		redButton.open(1000);
		redLED.open(1000);
		
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		greenButton.open(1000);
		greenLED.open(1000);
		
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);
        double m = temperatureSensor.getTemperature();
        //Use your Phidgets 
        
        System.out.println("the set temperature is 21");
        
        while (true) {
        	//increases the temperature by 1 when the green button is pressed
     	if (greenButton.getState() == true) {
       // 		greenLED.setState(true);
        		Thread.sleep(1000);
	     //       greenLED.setState(false);
	    //        Thread.sleep(1000);
        		m++;
				System.out.println("Temperature: " + m + " °C" );
				} else {
				greenLED.setState(false);
			}
     	// decreases the temperature by 1 when the red button is pressed
     	if (redButton.getState() == true) {
    		//redLED.setState(true);
    		Thread.sleep(1000);
         //   redLED.setState(false);
        //    Thread.sleep(1000);
    		m--;
			System.out.println("Temperature: " + m + " °C" );
			} else {
			redLED.setState(false);
		}
        	// turns the green led on if the temperature is between 19 and 23
     	if(19<m && m<23){
     		greenLED.setState(true);
     	}
     	else {
     		redLED.setState(true);
     	}
        
		
		
		
        }
	}
}
/*
* Screen Dump
* 
*
*/