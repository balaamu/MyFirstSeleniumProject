package com.selenium.util;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {

	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		try
		{
		WebDriver driver;
		//String test="123";

		// Setting the webdriver.chrome.driver property to its executable's
		// location
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\moni\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");

		// Instantiating driver object
		driver = new ChromeDriver();

		// Put an Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");

		// Store and Print the name of the First window on the console

		driver.findElement(By.xpath("//*[@id='win1']")).click();

		String winHandleBefore = driver.getWindowHandle();
		/*
		 * String handle= driver.getWindowHandle();
		 * 
		 * System.out.println(handle);
		 */

		// Click on the Button "New Message Window"

		// Store and Print the name of all the windows open

		// Set handles = driver.getWindowHandles();

		// System.out.println(handles);

		// Pass a window handle to the other window

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle1 : allWindowHandles) {
			System.out.println("Window handle - > " + handle1);
			driver.switchTo().window(handle1);

			String Title = driver.getCurrentUrl();

			System.out.println(Title);

		}
		Thread.sleep(3000);
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

		// Closing Pop Up window

		driver.close();
		
		

		// Close Original window

		driver.quit();
	}catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
	}

}