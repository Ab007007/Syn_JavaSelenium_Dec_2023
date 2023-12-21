package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.synechron.automation.tests.ExcelUtility;
import com.synechron.automation.utils.GlobalDataRreader;

public class FormFillMultiUser {

	WebDriver driver = null;

	@BeforeClass
	public void createDriver() {
		System.out.println("--- Driver Creation Initiated ---");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(GlobalDataRreader.getPropertyValue("timeout")),
				TimeUnit.SECONDS);
		System.out.println("--- Driver Creation Successfull ---");
	}

	@BeforeMethod
	public void setup() {

		driver.get(GlobalDataRreader.getPropertyValue("form_app_url"));
	}

	@Test(dataProvider = "formfillData", dataProviderClass = DataProviderDemo.class)
	public void createUser(String fn, String ln, String jt) throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys(fn);
		driver.findElement(By.id("last-name")).sendKeys(ln);
		driver.findElement(By.id("job-title")).sendKeys(jt);
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		Select yearOfExp = new Select(driver.findElement(By.id("select-menu")));
		yearOfExp.selectByValue("4"); // 10+
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(2000);
		String successMessage = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println("Sussess message " + successMessage);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
