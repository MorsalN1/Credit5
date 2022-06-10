package Lesson2;
/*
Program: practise2      Date: may 24, 2022

Purpose: 
Modify your code to print the state of your green button (Hint: Address).

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;

public class practise2 {
	 public static void main(String[] args) throws Exception{
	        
	        //Create 
	        DigitalInput greenButton = new DigitalInput();

	        //Address 
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);

	        //Open 
	        greenButton.open(1000);

	        //Use your Phidgets 
	        while(true){
	            System.out.println("Button State: " + greenButton.getState());
	            Thread.sleep(150);
	        }
	    }
}
/*
* Screen Dump
* 
*
*/