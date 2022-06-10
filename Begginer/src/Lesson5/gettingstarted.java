package Lesson5;
/*
Program: gettingstarted      Date: june 1, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that gets temperature and humidity data!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class gettingstarted {
	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
            System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(150);
        }
    }
}
/*
* Screen Dump
* 
*
*/