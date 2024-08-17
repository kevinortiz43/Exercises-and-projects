
package com.testng.linkedin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="smoke")
public class ConfigurationAnnotations_2_List {
	 @Test
	    public void test1_BoostrapDatePicker() {
	        System.out.println("This is a test 1 for List Box");
	    }

	    @Test 
	    public void test2_JQueryDatePicker() {
	        System.out.println("This is a test 2 for  List Box ");
	    }

	    @BeforeMethod
	    public void BeforeMethod() {
	        System.out.println("This is a Before Method for List Box");
	    }

	    @AfterMethod
	    public void AfterMethod() {
	        System.out.println("This is an After Method for List Box");
	    }

	    @BeforeClass
	    public void BeforeClass() {
	        System.out.println(" (3) Executer before class:Date Pickers This is a Before Class 	    for List Box");
	    }

	    @AfterClass
	    public void AfterClass() {
	        System.out.println(" (3) Executer after class:Date Pickers This is an After Class for List Box");
	    }
	    
	    @BeforeGroups(groups= {"regression","smoke"})
	    public void beforeGroups() {
	    	            System.out.println(" (3) Executer before groups:Date Pickers This is an Before Groups for List Box");
        }
	    
	    @AfterGroups(groups= {"regression","smoke"})
		public void afterGroups() {
			System.out.println(" (3) Executer after groups:Date Pickers This is an After Groups for List Box");
		}
	    
	    
}
