package AttachDetach;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you will learn how to use attach and detach events so you can keep track of the Phidgets in your programs!


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.AttachEvent;
import com.phidget22.AttachListener;
import com.phidget22.DetachEvent;
import com.phidget22.DetachListener;
import com.phidget22.TemperatureSensor;
import com.phidget22.TemperatureSensorTemperatureChangeEvent;
import com.phidget22.TemperatureSensorTemperatureChangeListener;

public class gettingstarted {
	public static void main(String[] args) throws Exception {
	       
        //Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();

       //Data Event 
       temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
           public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
               //Print temperature
               System.out.println("Temperature: " + e.getTemperature() + "°C");
           }
       });

       //Attach Event 
       temperatureSensor.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach!");
           }
       });

       //Detach Event 
       temperatureSensor.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach!");
           }
       });

       //Open
       temperatureSensor.open(1000);

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