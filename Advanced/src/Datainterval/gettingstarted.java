package Datainterval;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you will learn how to use the Data Interval so you can change how often your sensors report data!

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;
import com.phidget22.TemperatureSensorTemperatureChangeEvent;
import com.phidget22.TemperatureSensorTemperatureChangeListener;

public class gettingstarted {
	  public static void main(String[] args) throws Exception {

	        //Create
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        //Temperature Event 
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                System.out.println("Temperature: " + e.getTemperature());
	            }
	        });

	        //Open
	        temperatureSensor.open(5000);

	        //Set Data Interval 
	        temperatureSensor.setDataInterval(1000);

	        //Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
}
/*
* Screen Dump
* 
*
*/