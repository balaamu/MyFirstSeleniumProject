/*package com.selenium.util;

import java.util.HashMap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class Practice {

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		WebDriver driver1;

		// Setting the webdriver.chrome.driver property to its executable's
		// location
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\moni\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");

		HashMap<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Nexus 5");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		// Instantiating driver object
		//driver = new ChromeDriver();

		// Put an Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL

		driver.get("https://demoqa.com/iframe-practice-page/");
		
		driver.switchTo().frame(0);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='page']/a[1]")).click();
		driver.switchTo().defaultContent();	
		driver.findElement(By.xpath("//*[@id='menu-top']/li[1]/a")).click();

		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
*/