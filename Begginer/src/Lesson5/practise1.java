package Lesson5;
/*
Program: practise1      Date: june 1, 2022

Purpose: 
Only print the humidity if it is above 30%. If it is bellow 30% print “Humidity is low”.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class practise1 {
	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
        	// checks if humidity is above 30% 
        	if(humiditySensor.getHumidity()>30) {
        		//outputs humidity if is
        		System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH" );
                Thread.sleep(150);
        	}
        	else {
        		// outputs humidity is low if under 30%
            System.out.println("Humidity is low ");
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