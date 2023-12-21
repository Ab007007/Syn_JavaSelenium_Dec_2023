package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeMethod
	public void setup() {
		System.out.println("-----------------------------");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("#################################");
	}
	
	@Parameters({ "url" })
	@Test(priority = 1)
	public void launch(String url)
	{
		System.out.println("done" + url);
	}


	@Test(priority = 2)
	public void loginTest()
	{
		System.out.println("done");
	}
	
	@Test(priority = 3)
	public void crateCustomer()
	{
		System.out.println("done");
	}
	
	@Test(priority = 4)
	public void deleteCustomer()
	{
		System.out.println("done");
	}
}
