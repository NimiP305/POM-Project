package ui;


	
import org.testng.annotations.Test;

import common.CommonDataSetup;

	
	@Test(groups = "user registration")//if we want to run all groups 
	public class GroupTest2 extends CommonDataSetup{
	
		
		@Test (priority = 1, groups = "regression")
		 public void aTest1() {
			 System.out.println ("test1");	 
		 }
		
		@Test (priority = 2, groups = {"regression", "smoke"})
		public void bTest2() {
			 System.out.println ("test2"); 
		}
		
		@Test (priority = 3, groups = "smoke")
		public void bTest3() {
			 System.out.println ("test3"); 
		}
	}


