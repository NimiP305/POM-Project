package ui;


	import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

	
	@Test(groups = "user registration")//if we want to run all groups 
	public class GroupTest extends CommonDataSetup {
	
		@BeforeClass
		public void beforeclass() {
			System.out.println("print before class");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("print after class");
		}
		 
		@BeforeGroups(value="regression")
		public void beforegroups() {
			System.out.println("Run this before regression");
			
		}
		
		@AfterGroups(value="regression")
		public void aftergroups() {
			System.out.println("Run this after regression");
			
		}
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


