package Calculateweight;
/*
Program: practise2      Date: June 8, 2022

Purpose: 
Convert the scale output to pounds instead of kg. (Hint: 1kg = 2.205lbs)


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.VoltageRatioInput;

public class practise2 {
	public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Offset Value
        double offsetValue =    2.1429732451881157E-5;

        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
            double weightlb = weight * 2.205;
            
            //Display Weight
            System.out.println(String.format("%.3f lbs", weightlb));      
            
            Thread.sleep(250);
        }
    }    
}

/* Screen Dump
-1.989 lbs
-1.989 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.001 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
0.002 lbs
-0.046 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.103 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.104 lbs
-0.103 lbs
-0.104 lbs
*/

