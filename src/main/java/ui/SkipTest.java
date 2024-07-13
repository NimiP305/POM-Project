package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class SkipTest extends CommonDataSetup {

	Boolean datasetup = true;
	
	@Test(enabled=false)
	public void skipTest1() {
		
		System.out.println("skipping the test as it is not complete");
	}
	@Test	
	public void skipTest2() {
		
		System.out.println("skipping the test forcefully");
		throw new SkipException("Skipping the test");
	}
	@Test
	public void skipTest3() {
	
	System.out.println("skipping the test based on condition");
	if(datasetup=true) {
	System.out.println("Execute the test");}
	else 
		System.out.println("Do not execute the further steps");
		throw new SkipException("Do not execute the further steps");
	
	}
}
