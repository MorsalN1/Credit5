package Buttonevents;
/*
Program: practise2pt5000      Date: june 8, 2022

Purpose: 
Modify the loop to repeat every 10ms, 1000ms, 5000ms. Note how the behavior of your program changes (or doesn’t) with the different times.

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;

public class practise2pt5000 {
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
        redButton.open(5000);

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