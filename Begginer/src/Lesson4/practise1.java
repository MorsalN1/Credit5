package Lesson4;
/*
Program: practise1      Date: june 1, 2022

Purpose: 
Convert temperature data from degrees Celsius to degrees Fahrenheit. Hint: °F = (°C × 1.8) + 32

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;

public class practise1 {
public static void main(String[] args) throws Exception{

		
        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
        	// converts the temperature into farenheit
        	double m = (temperatureSensor.getTemperature())*1.8 + 32;
        	
            System.out.println("Temperature: " + m + " °F" );
            Thread.sleep(150);
        }
    }
}
/*
* Screen Dump
* 
*
*/