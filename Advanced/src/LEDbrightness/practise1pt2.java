package LEDbrightness;
/*
Program: practise1pt2      Date: june 8, 2022

Purpose: 
Change your Duty Cycle value to 0, 0.5, and 1. Note what happens to your LED with each value.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class practise1pt2 {
	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle 
        redLED.setDutyCycle(1);
        Thread.sleep(1000);
        redLED.setDutyCycle(1);
    }
}
/*
* Screen Dump
* 
*
*/