package error;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you will learn about handling errors that may occur in your code.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.PhidgetException;
import com.phidget22.TemperatureSensor;


public class gettingstarted {
	public static void main(String[] args){

        try{
        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        } catch(PhidgetException ex){
            //Catch any errors that may occur 
            System.out.println("Failure: " + ex);
        }
    }
}
/*
* Screen Dump
* 
*
*/