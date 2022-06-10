package Lesson4;
/*
Program: gettingstarted      Date: june 1, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that gets data from a temperature sensor!

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
        while (true) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(150);
        }
    }
}
/*
* Screen Dump
* 
*
*/