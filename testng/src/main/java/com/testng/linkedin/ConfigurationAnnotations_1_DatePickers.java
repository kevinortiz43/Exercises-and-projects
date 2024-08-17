package com.testng.linkedin;



import org.testng.annotations.AfterClass; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigurationAnnotations_1_DatePickers {
    



    @Test(groups="smoke")
    public void test1_BoostrapDatePicker() {
        System.out.println("This is a test for Boostrap Date Picker...................");
    }

    @Test(groups= {"regression","e2e"})
    public void test2_JQueryDatePicker() {
        System.out.println("This is a test for JQuery Date Picker");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("This is a Before Method");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("This is an After Method");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println(" (3) Executer before class:Date Pickers This is a Before Class");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println(" (3) Executer after class:Date Pickers This is an After Class");
    }
    
    @BeforeSuite
	public void BeforeSuite() {
		System.out.println(" (3) Executer before suite:Date Pickers This is a Before Suite");
	}
    
    @AfterSuite
        public void AfterSuite() {
    	            System.out.println(" (3) Executer after suite:Date Pickers This is an After Suite");
    }

}
