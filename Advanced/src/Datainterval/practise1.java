package Datainterval;
/*
Program: practise1      Date: june 8, 2022

Purpose: 
Set the Data Interval to the minimum value: 500ms. Note the Output.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.TemperatureSensor;
import com.phidget22.TemperatureSensorTemperatureChangeEvent;
import com.phidget22.TemperatureSensorTemperatureChangeListener;

public class practise1 {
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
	        temperatureSensor.setDataInterval(500);

	        //Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	
	
	
	/*
	 * the program outputs the temperature at a faster pace
	 */
}
/*
* Screen Dump
* 
*
*/