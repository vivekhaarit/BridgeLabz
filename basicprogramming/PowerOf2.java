package com.bridgelabz.basicprogramming;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.myexceptions.MyException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;

public class PowerOf2 {
	
	public static void main(String[] args) 
			throws MyException{
		
		LogUtility.setLog(PowerOf2.class.getName());
		Logger logger = LogUtility.getLog();
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("enter the heighest power of 2 you want: ");
		
		try {
			int n = InputUtility.getInt();
			Utility.calculatePowerOfTwo(n);
		}
		catch(MyException e) {
			logger.error(e);
			e.printStackTrace();
		}
	}
}
