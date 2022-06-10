package Lesson3;
/*
Program: practise1      Date: may 24, 2022

Purpose: 
Modify your code so the LED turns off when the button is pressed and turns on when the button is released.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class practise1 {
	 public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        //Use your Phidgets 
	        while(true){

	            if( redButton.getState()){
	            	// will keep the LED off when the button is pressed
	                redLED.setState(false);
	            } else {
	                redLED.setState(true);
	            }

	            if(greenButton.getState()){
	            	// will keep the LED off when the button is pressed

	                greenLED.setState(false);
	            } else {
	                greenLED.setState(true);
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