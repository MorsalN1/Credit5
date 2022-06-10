package Calculateweight;
/*
Program: practise1      Date: June 8, 2022

Purpose: 
Convert the scale output to grams instead of kg. (Hint: 1kg = 1000g).


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.VoltageRatioInput;

public class practise1 {
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
	            double weightg = weight * 1000;
	            
	            //Display Weight
	            System.out.println(String.format("%.3f g", weightg));      
	            
	            Thread.sleep(250);
	        }
	    }    
}

/* Screen Dump
-1024.301 g
-1024.301 g
0.963 g
0.880 g
0.794 g
0.799 g
0.805 g
0.757 g
0.786 g
0.718 g
0.755 g
-6.568 g
-52.376 g
-47.532 g
-46.959 g
-46.913 g
-46.926 g
-46.939 g
-46.933 g
-46.959 g
-46.926 g
-46.941 g
-46.963 g
-46.941 g
-46.924 g
-46.873 g
-46.959 g
-46.941 g
-46.972 g
-46.959 g
-46.943 g
-46.941 g
-46.906 g
*/
