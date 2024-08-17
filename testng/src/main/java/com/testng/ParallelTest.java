package com.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

WebDriver driver;

@Test(priority = 1)
public void testChrome() throws InterruptedException {
System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.bstackdemo.com/");
driver.manage().window().maximize();

}

@Test(priority = 2)
public void testFirefox() throws InterruptedException {
System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.get("https://www.bstackdemo.com/");
driver.manage().window().maximize();

}

@AfterClass
public void close() {
driver.quit();
} 
}