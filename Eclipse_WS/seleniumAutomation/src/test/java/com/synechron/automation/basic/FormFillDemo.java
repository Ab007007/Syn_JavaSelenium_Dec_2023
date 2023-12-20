package com.synechron.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillDemo {

	
	@Test
	public void simpleTest() throws InterruptedException 
	{
	//	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("H");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.linkText("Submit")).click();
		
		Thread.sleep(2000);
		
		String successMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		
		System.out.println("Sussess message " + successMessage);
	}
}
