package Calculateweight;
/*
Program: gettingstarted      Date: June 8, 2022

Purpose: 
Now that you've calculated your offset value, you will use it to convert your scale's output to a weight in kilograms.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.VoltageRatioInput;

public class gettingstarted {
	 public static void main(String[] args) throws Exception{

	        //Create
	        VoltageRatioInput scale = new VoltageRatioInput();
	        
	        //Open
	        scale.open(1000);
	        
	        //Use your Offset Value
	        double offsetValue =   2.1429732451881157E-5;

	        
	        //Use your Phidgets
	        while(true){

	            //Calculate Weight (kg)
	            double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
	            
	            
	            //Display Weight
	            System.out.println(String.format("%.3f kg", weight));      
	            
	            Thread.sleep(250);
	        }
	    }    
}
/* Screen Dump
-0.000 kg
-0.000 kg
-0.000 kg
-0.000 kg
-0.000 kg
-0.000 kg
-0.000 kg
-0.002 kg
-0.040 kg
-0.048 kg
-0.048 kg
-0.048 kg
-0.048 kg
-0.048 kg


*/
