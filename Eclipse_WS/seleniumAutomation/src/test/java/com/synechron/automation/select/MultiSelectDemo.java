package com.synechron.automation.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Synechron_WE_JavaSelenium/html/multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		
		
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		sel.deselectByValue("mercedes");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.deselectAll();
		
	
	}

}
