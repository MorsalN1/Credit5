package Closingphidgets;
/*
Program: practise2      Date: june 8, 2022

Purpose: 
Try calling open again after closing your Phidget. Can you print the temperature again?


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;

public class practise2 {
	public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
       
        //opens the phidget again
        temperatureSensor.open();
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
    }
}
/*
* Screen Dump
* 
*
*/