package scaleoffset;
/*
Program: scaleoffset      Date: June 8, 2022

Purpose: 
In this step, you will learn how to measure your scale's offset.


Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/
import com.phidget22.VoltageRatioInput;

public class scaleoffset {
	 public static void main(String[] args) throws Exception{
	        //Create
	        VoltageRatioInput scale = new VoltageRatioInput();
	        
	        //Open
	        scale.open(1000);
	        
	        //Use your Phidgets
	        while(true){
	            System.out.println("Offset Value: " + scale.getVoltageRatio());
	            Thread.sleep(250);
	        }
	    }   
}

/* Screen Dump
Offset Value: 2.1490268419259353E-5
Offset Value: 2.1465122709733025E-5
Offset Value: 2.1439511338919174E-5
Offset Value: 2.1430663774456207E-5
Offset Value: 2.143718303248155E-5
Offset Value: 2.142088488741819E-5
Offset Value: 2.1434389064756403E-5
Offset Value: 2.143299208089383E-5
Offset Value: 2.142600716158096E-5
Offset Value: 2.1396670500466912E-5
Offset Value: 2.1402724097204732E-5
Offset Value: 2.1411106000380174E-5
Offset Value: 2.1432526419606305E-5
Offset Value: 2.1430198113168682E-5
Offset Value: 2.1429732451881157E-5
Offset Value: 2.1429732451881157E-5


*/

