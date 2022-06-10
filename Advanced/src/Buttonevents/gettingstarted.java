package Buttonevents;
/*
Program: gettingstarted      Date: june 8, 2022

Purpose: 
In this lesson, you’ll learn how to write a program that gets input from a button using events!



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;

public class gettingstarted {
	public static void main(String[] args) throws Exception {
	       
        //Create
        DigitalInput redButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                System.out.println("State: " + e.getState());
            }
        });

        //Open
        redButton.open(1000);

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