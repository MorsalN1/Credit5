package Buttonevents;
/*
Program: practise3      Date: june 8, 2022

Purpose: 
Change the program output to print pressed and not pressed.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.DigitalInput;
import com.phidget22.DigitalInputStateChangeEvent;
import com.phidget22.DigitalInputStateChangeListener;

public class practise3 {
	public static void main(String[] args) throws Exception {
	       
        //Create
        DigitalInput redButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

       
        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            { 
            	if(e.getState()) {
            		System.out.println("State: pressed " );	
            	}
            	
            	else{
            		System.out.println("State: not pressed " );	
            	}
                
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