package LEDbrightness;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that dims an LED!


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class gettingstarted {
	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle 
        redLED.setDutyCycle(0.1);
        Thread.sleep(1000);
        redLED.setDutyCycle(0.0);
    }
}
/*
* Screen Dump
* 
*
*/