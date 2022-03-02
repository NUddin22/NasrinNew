package com.bit.test;

import org.testng.ITestListener;

	import org.testng.ITestContext ;		
	import org.testng.ITestListener ;		
	import org.testng.ITestResult ;		

	public class ListenerTest implements ITestListener						
	{		

	    		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        	System.out.println(arg0.getName()+"is finished");	
	    }		

	   		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        	System.out.println(arg0.getName()+"is started");	
	    }		

	    		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        System.out.println(arg0.getName()+"is failed");	
	        System.out.println("call screen sot method");
	    }		

	    		
	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	}		
	Let’s modify the ‘List

}
