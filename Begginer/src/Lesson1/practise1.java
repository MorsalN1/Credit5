package Lesson1;
/*
Program: practsie1      Date: may 17, 2022

Purpose: 
Modify your code so the LED stays on for 2 seconds.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class practise1 {
	public static void main(String[] args) throws Exception{

		DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //flashes the red light for 2 seconds
        redLED.open(2000);

        while(true){
            redLED.setState(true);
            Thread.sleep(2000);
            redLED.setState(false);
            Thread.sleep(2000);
        }
    }
}
/*
* Screen Dump
* 
*
*/