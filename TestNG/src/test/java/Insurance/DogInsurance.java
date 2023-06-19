package Insurance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DogInsurance {
	@BeforeMethod
	public void setup()
	{
		System.out.println("running before each method!");
	}
//	@AfterMethod
//	{
//		System.out.println("Teardown test env.....");
//	}
	@Test(priority=1)
	public void WebLoginDogInsurance()
	{
		System.out.println("Dog Insurance Web login");
	}
	@Test(priority=2)
	public void WebLogoutDogInsurance()
	{
		System.out.println("Dog Insurance Web logout");
	}
	@Test(priority=3)
	public void mobileLoginDogInsurance()
	{
		System.out.println("Dog Insurance Mobile login");
	}
	@Test(priority=4)
	public void mobileLogoutDogInsurance()
	{
		System.out.println("Dog Insurance Mobile logout");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This method will be executed after each method");
	}
}
