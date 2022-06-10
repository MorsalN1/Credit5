package Lesson1;
/*
Program: practsie3      Date: may 17, 2022

Purpose: 
Modify your code to flash the green LED. (Hint: Address)

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class practise3 {
	public static void main(String[] args) throws Exception{

		  DigitalOutput greenLED = new DigitalOutput();

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        greenLED.open(1000);
// flashes the green light
        while(true){
            greenLED.setState(true);
            Thread.sleep(1000);
            greenLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
/*
* Screen Dump
* 
*
*/