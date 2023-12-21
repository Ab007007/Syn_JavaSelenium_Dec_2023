package com.synechron.automation.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovementDemo {
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='_30XB9F']"))));
		ele.click();

		WebElement electronicsModule = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		WebElement fashionModule = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		WebElement homeModule = driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));

		Actions act = new Actions(driver);
		act.moveToElement(electronicsModule).perform();
		Thread.sleep(3000);
		printSuggetions();
		act.moveToElement(fashionModule).perform();
		Thread.sleep(3000);
		printSuggetions();
		act.moveToElement(homeModule).perform();
		Thread.sleep(3000);
		printSuggetions();
		driver.close();

	}

	public static void printSuggetions() {
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='_1UgUYI _2eN8ye']//a"));
		System.out.println("Printing elements...");
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
