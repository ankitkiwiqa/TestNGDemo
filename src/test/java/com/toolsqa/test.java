package com.toolsqa;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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


public class test {

	RemoteWebDriver driver;
	
	/*@Test(groups = { "test-group1"})*/
	//@Test(dependsOnMethods = { "testCase2" })
	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("This is the Test Case 1");
		Reporter.log("1. Open URL: <b>www.toolsqa.com</b>");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement DemoSiteslink = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='DEMO SITES']"));
		Thread.sleep(20000);
		Reporter.log("2. Mouse hover on Demosite.");
		Actions action = new Actions(driver);
		action.moveToElement(DemoSiteslink).build().perform();
		
		Thread.sleep(2000);
	}

	@Test
	public void testCase2() throws InterruptedException {

		Reporter.log("This is the Test Case 2");
		driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='FORUM']")).click();
		System.out.println("This is the Test Case 2");
		Thread.sleep(2000);
	}
	
	@Test(groups = { "test-group2" })
	public void testCase3() throws InterruptedException {

		Reporter.log("This is the Test Case 2");
		Actions action = new Actions(driver);
		WebElement link_tools = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Tools']"));
	
		action.moveToElement(link_tools).build().perform();
		
		Thread.sleep(2000);
		
		WebElement link_uiAutomation = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='UI Automation']"));
		action.moveToElement(link_uiAutomation).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='primary-menu']//span[text()='Selenium Tutorial']")).click(); 
		
		Thread.sleep(2000);
	}
	

	
	@Parameters({"Browser"})
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(@Optional("Browser")String browser) throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setJavascriptEnabled(true);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
			driver = new ChromeDriver(option);
		}else
		{
			driver = new FirefoxDriver(caps);
		}
		
		//driver = new ChromeDriver(option);
		/*if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}*/
		 
		 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com");

	}

	@AfterMethod(alwaysRun=true)
	public void afterMethod() {

		System.out.println("This will execute after every Method");
		driver.close();

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