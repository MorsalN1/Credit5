package Lesson3;
/*
Program: gettingstarted      Date: may 24, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that uses both LEDs and buttons!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class gettingstarted {
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
                redLED.setState(true);
            } else {
                redLED.setState(false);
            }

            if(greenButton.getState()){
                greenLED.setState(true);
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
