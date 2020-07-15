package com.selenium.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			WebDriver driver;

			// Setting the webdriver.chrome.driver property to its executable's
			// location
			System.setProperty(
					"webdriver.chrome.driver",
					"C:\\Users\\moni\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");

			// Instantiating driver object
			driver = new ChromeDriver();

			// Put an Implicit wait, this means that any search for elements on
			// the page could take the time the implicit wait is set for before
			// throwing exception

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Launch the URL

			driver.get("https://demoqa.com/droppable/");
			
			Actions actions = new Actions(driver);
			WebElement source=	driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement target=	driver.findElement(By.xpath("//*[@id='droppable']"));	
			actions.dragAndDrop(source, target).perform();
			
			driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[8]/a")).click();
			
		/*	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Hello CTS");
			
			Actions builder = new Actions(driver);
	        builder.keyDown(Keys.TAB).build();
	        builder.perform();*/
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
