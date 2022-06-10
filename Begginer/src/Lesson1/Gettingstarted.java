package Lesson1;
/*
Program: scaleoffset      Date: may 17, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that blinks an LED!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class Gettingstarted {
	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        while(true){
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
/*
* Screen Dump
* 
*
*/