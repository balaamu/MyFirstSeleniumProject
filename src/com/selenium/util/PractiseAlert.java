package com.selenium.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		WebDriver driver;

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
		
		driver.findElement(By.xpath("//*[@id='alertBox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 300 /*timeout in seconds*/);
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		    System.out.println("alert was not present");
		else
		    System.out.println("alert was present");

		// Switching to Alert        
        Alert alert = driver.switchTo().alert();

        alert.accept();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
        
     // Switching to Alert        
        Alert alert1 = driver.switchTo().alert();

        alert1.dismiss();
        
        driver.findElement(By.xpath("//*[@id='promptBox']")).click();
        
        // Switching to Alert        
        Alert alert2 = driver.switchTo().alert();

        alert2.sendKeys("Hello CTS");
        
       System.out.println(alert2.getText());
        
        // Closing Pop Up window

		// driver.close();

		// Close Original window

		// driver.quit();
	}catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
	

	}

}
