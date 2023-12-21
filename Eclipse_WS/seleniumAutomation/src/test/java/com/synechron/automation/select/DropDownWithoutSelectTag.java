package com.synechron.automation.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		Thread.sleep(5000);
		String dpText = driver.findElement(By.xpath("//h1")).getText();
		
		Assert.assertEquals(dpText, "Datepicker");
		
	}
}
