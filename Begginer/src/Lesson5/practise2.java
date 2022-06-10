package Lesson5;
/*
Program: practise2      Date: june 1, 2022

Purpose: 
Only print the temperature if it is above 21°C (70°F). If the temperature is below 21°C, print "Room is too cold".

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class practise2 {
	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
        	
        	// checks if the temp if is over 21
        	if(temperatureSensor.getTemperature() > 21) {
        		//outputs if is
        		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
                  Thread.sleep(150);	
        	}
        	else { 
        		//outputs room is cold if under 21
            System.out.println("the room is to cold" );
            Thread.sleep(150);
        }
        	}
    }
}
/*
* Screen Dump
* 
*
*/
