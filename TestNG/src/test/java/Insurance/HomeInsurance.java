package Insurance;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeInsurance {
	@BeforeSuite
	public void bsuit()
	{
		System.out.println("BeforeSuite will be running first");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("AfterSuite will run at last");
	}
	@Test(priority=1)
	public void WebLoginHomeInsurance()
	{
		System.out.println("Home Insurance Web login");
	}
	@Test(priority=2)
	public void WebLogoutHomeInsurance()
	{
		System.out.println("Home Insurance Web logout");
	}
	@Test(priority=3)
	public void mobileLoginHomeInsurance()
	{
		System.out.println("Home Insurance Mobile login");
	}
	@Test(priority=4)
	public void mobileLogoutHomeInsurance()
	{
		System.out.println("Home Insurance Mobile logout");
	}
}
