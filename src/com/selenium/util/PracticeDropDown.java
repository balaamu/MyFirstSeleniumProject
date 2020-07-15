package com.selenium.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
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

			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");

			Select programminglanguage = new Select(driver.findElement(By
					.id("programming-languages")));

			programminglanguage.selectByIndex(2);
			System.out.println(programminglanguage.getFirstSelectedOption()
					.getText());
			Thread.sleep(2000);
			programminglanguage.selectByValue("Python");
			System.out.println(programminglanguage.getFirstSelectedOption()
					.getText());
			Thread.sleep(2000);
			programminglanguage.selectByVisibleText("Java");
			System.out.println(programminglanguage.getFirstSelectedOption()
					.getText());

			System.out.println(programminglanguage.isMultiple());

			Select selenium_suite = new Select(driver.findElement(By
					.id("selenium_suite")));
			System.out.println(selenium_suite.isMultiple());

			selenium_suite.selectByIndex(2);
			System.out.println(selenium_suite.getFirstSelectedOption()
					.getText());
			Thread.sleep(2000);
			selenium_suite.selectByValue("Grid");
			System.out.println(selenium_suite.getFirstSelectedOption()
					.getText());

			System.out.println(selenium_suite.getAllSelectedOptions()
					.toString());
			
			List<WebElement> selectedOptions = new Select(driver.findElement(By
					.id("selenium_suite"))).getAllSelectedOptions();
		
			 for (WebElement selectedOption : selectedOptions) {
			 System.out.println(selectedOption.getText());
			 }
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
