package Lesson1;

/*
Program: practsie2      Date: may 17, 2022

Purpose: 
Modify your code so the LED flashes on and off 3 times.
Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class practise2 {
	public static void main(String[] args) throws Exception{

		int i=0;
		DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        // light stays on for 1 second
        redLED.open(1000);

        while(true){
        	// runs until the light flashes 3 times
        	while(i < 3)
        		i++;
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