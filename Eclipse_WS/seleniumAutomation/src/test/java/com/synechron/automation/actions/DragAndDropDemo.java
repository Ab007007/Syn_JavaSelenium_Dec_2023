package com.synechron.automation.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		// WebDriverManager.edgedriver().setup();
		// WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));

		System.out.println("--Before Drag and Drop ---------");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Dest Element " + destEle.getText());

		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle, destEle).perform();

		System.out.println("--After Drag and Drop ---------");
		System.out.println("Source Element " + srcEle.getText());
		System.out.println("Dest Element " + destEle.getText());

		// to perform right click
		act.contextClick();
		// double click
		act.doubleClick();
		//
		act.clickAndHold();
		act.release();

	}
}
