package Closingphidgets;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you will learn about closing your Phidget.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;

public class gettingstarted {
	public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
    }


}
/*
* Screen Dump
* 
*
*/