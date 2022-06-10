package Lesson2;
/*
Program: gettingstarted      Date: may 17, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that gets input from a button!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;

public class gettingstarted {
	 public static void main(String[] args) throws Exception{
	        
	        //Create 
	        DigitalInput redButton = new DigitalInput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(1000);

	        //Use your Phidgets 
	        while(true){
	            System.out.println("Button State: " + redButton.getState());
	            Thread.sleep(150);
	        }
	    }
}
/*
* Screen Dump
* 
*
*/