package com.insurance.GenericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpClass implements IRetryAnalyzer{
	
	int counter=0;
	int retryLimit=4;
	
	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
		return false;
		
	}

}
