package com.selenium.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeKeyboardEvent {

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

		driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
				
		Actions actions = new Actions(driver);
		actions.doubleClick(ele).perform();
		

		// Switching to Alert        
        Alert alert = driver.switchTo().alert();

        alert.accept();
        
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		
		actions.contextClick(ele1).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='tooltipDemo']"));
		actions.moveToElement(ele2).build().perform();
	    WebElement toolTipElement = driver.findElement(By.xpath("//*[@id='tooltipDemo']/span"));
	    String toolTipText = toolTipElement.getText();
	    System.out.println(toolTipText);
		
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
