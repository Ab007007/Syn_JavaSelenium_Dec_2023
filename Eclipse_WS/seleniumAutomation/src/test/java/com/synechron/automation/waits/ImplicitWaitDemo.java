package com.synechron.automation.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo {
	
	@Test
	public void test() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Synechron");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li[@role='presentation']"));
		
		System.out.println("Total suggesitons " + autoSuggestions.size());
		for (WebElement autoSuggestion : autoSuggestions) 
		{
			System.out.println(autoSuggestion.getText());
		}
		
		driver.close();
	}
}
