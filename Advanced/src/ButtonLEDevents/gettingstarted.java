package ButtonLEDevents;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you�ll learn how to write a program that gets input from a button using events and outputs to an LED!


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;
import com.phidget22.DigitalOutput;

public class gettingstarted {
	 static boolean turnRedLEDOn = false;
	    static boolean turnGreenLEDOn = false;

	    //Handle Exceptions
	    public static void main(String[] args) throws Exception {

	        //Create
	        DigitalInput redButton = new DigitalInput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Event 
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the red LED
	                turnRedLEDOn = e.getState(); 
	            }
	        });

	        //Event 
	        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the green LED
	                turnGreenLEDOn = e.getState();
	            }
	        });

	        //Open
	        redLED.open(1000);
	        greenLED.open(1000);
	        redButton.open(1000);
	        greenButton.open(1000);

	        //Use your Phidgets 
	        while(true) {
	            //turn red LED on based on red button input
	            redLED.setState(turnRedLEDOn);
	            //turn green LED on based on green button input
	            greenLED.setState(turnGreenLEDOn);
	            //sleep for 150 milliseconds 
	            Thread.sleep(150);
	        }
	    }
}
/*
* Screen Dump
* 
*
*/