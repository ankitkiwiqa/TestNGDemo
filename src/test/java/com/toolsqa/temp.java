package com.toolsqa;


import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.DragAndDrop;

public class temp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Software\\Selenium\\chromedriver_2_33.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://demoqa.com/resizable/");
		Thread.sleep(3000);
		WebElement ele1= driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		WebElement ele2= driver.findElement(By.xpath("//li[@id='menu-item-145']"));
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		//action.dragAndDrop(ele1, ele2).build().perform();
		action.dragAndDropBy(ele1, 400, 200).build().perform();
		
		Thread.sleep(3000);*/
		
		
		
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		WebElement ele1= driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]"));
		
		Select sel = new Select(ele1);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		Thread.sleep(3000);
	
		Thread.sleep(3000);
		
		driver.close();
	}

}
