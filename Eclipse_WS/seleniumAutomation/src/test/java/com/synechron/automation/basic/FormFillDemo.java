package com.synechron.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFillDemo {

	public static void main(String[] args) throws InterruptedException 	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//	WebDriverManager.chromedriver().browserVersion("120.0.6099.109").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("H");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-button-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.linkText("Submit")).click();
		
		Thread.sleep(5000);
		
		String successMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		
		System.out.println("Sussess message " + successMessage);
	}
}
