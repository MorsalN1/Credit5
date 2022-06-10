package LEDbrightness;
/*
Program: practise2      Date: june 8, 2022

Purpose: 
Modify your program so the brightness of your LED slowly increases and decreases before turning off. Hint: Use a loop.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalOutput;

public class practise2 {
	public static void main(String[] args) throws Exception{

		double x=0;
		double n = 0.1;
        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //increase the x value each time, the brightness
        while(true) {
        redLED.setDutyCycle(x);
        x +=n;
        Thread.sleep(1000);
        redLED.setDutyCycle(0.0);
        }
    }
}
/*
* Screen Dump
* 
*
*/