package com.toolsqa;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test2 {

	
	/*@Test(groups = { "test-group1"})*/
	//@Test(dependsOnMethods = { "testCase2" })
	@Test
	public void testCase1()  {
		System.out.println("This is the Test Case 1");
	}

	@Test
	public void testCase2()  {

		System.out.println("This is the Test Case 2");
	
	}
	
	@Test(groups = { "test-group2" })
	public void testCase3() {

		System.out.println("This is the Test Case 3");
	
	}
	

	
	@Parameters({"Browser"})
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}

	@AfterMethod(alwaysRun=true)
	public void afterMethod() {

		System.out.println("This will execute after every Method");
		

	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("This will execute before the Class");

	}

	@AfterClass
	public void afterClass() {

		System.out.println("This will execute after the Class");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("This will execute before the Test");

	}

	@AfterTest
	public void afterTest() {

		System.out.println("This will execute after the Test");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("This will execute before the Test Suite");

	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("This will execute after the Test Suite");

	}

}