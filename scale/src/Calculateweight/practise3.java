package Calculateweight;
/*
Program: practise3      Date: June 8, 2022

Purpose: 
Modify your program so the offset is automatically calculated when the program boots. It should be calculated at the beginning 
of your program, and average 64 samples. While averaging, it should print "Calculating Offset" to the user.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.VoltageRatioInput;

public class practise3 {
	public static void main(String[] args) throws Exception{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        double i =0;
        double l =0;
        double n =0;
        //Open
        scale.open(1000);
        
        //Use your Phidgets
        while(true){
        	double k = 0;
        	while(l<64) {
            System.out.println("Offset Value: " + scale.getVoltageRatio());
            Thread.sleep(5);
            l++;
            n += scale.getVoltageRatio(); 
             
            //System.out.println("total  :  " + k);
            }
        	k = n/64;
        	System.out.println("total  :  " + k);
            //Calculate Weight (kg)
            double weight = 4700 * (scale.getVoltageRatio() - k);
            
            
            //Display Weight
            System.out.println(String.format("%.3f kg", weight ));      
            
            Thread.sleep(250);
            }
           
        //Use your Offset Value
        
        //Use your Phidgets
        
	}
	}
/* Screen Dump
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.1595507870239908E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
Offset Value: 2.164347098285494E-5
total  :  2.1602252682951397E-5
0.000 kg
total  :  2.1602252682951397E-5
0.000 kg
total  :  2.1602252682951397E-5
0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.000 kg
total  :  2.1602252682951397E-5
-0.002 kg
total  :  2.1602252682951397E-5
-0.011 kg
total  :  2.1602252682951397E-5
-0.040 kg
total  :  2.1602252682951397E-5
-0.048 kg
total  :  2.1602252682951397E-5


*/



