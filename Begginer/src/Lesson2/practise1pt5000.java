package Lesson2;
/*
Program: practise1pt5000      Date: may 17, 2022

Purpose: 
Modify the loop to repeat every 10ms, 1000ms, 5000ms. Note how the behavior of your program changes with the different times.​

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;

public class practise1pt5000 {
	 public static void main(String[] args) throws Exception{
	        
	        //Create 
	        DigitalInput redButton = new DigitalInput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        //Open 
	        // button state will be outputed every 5 seconds
	        redButton.open(5000);

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