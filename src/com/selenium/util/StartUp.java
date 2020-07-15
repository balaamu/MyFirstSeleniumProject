package com.selenium.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class StartUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moni\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
     
        //Instantiating driver object
        driver = new ChromeDriver();
         
        //Using get() method to open a webpage
        driver.get("http://google.com");
         
        System.out.println("Browser Lauch successfully");
        
        //Closing the browser
        driver.close();
        
        /*WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));*/
       
	}

}
