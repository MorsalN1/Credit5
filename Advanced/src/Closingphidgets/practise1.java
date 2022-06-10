package Closingphidgets;
/*
Program: practise1      Date: june 8, 2022

Purpose: 
Try printing temperature from your Phidget after the close call. What error do you get?


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;

public class practise1 {
	public static void main(String[] args) throws Exception{

		 TemperatureSensor temperatureSensor = new TemperatureSensor();

	     //Open
	     temperatureSensor.open(1000);

	    
	     //Close your Phidgets
	    temperatureSensor.close();
	    
//outprint the temperature
	    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	    
	}
}
/*
* Screen Dump
* 
*
*/