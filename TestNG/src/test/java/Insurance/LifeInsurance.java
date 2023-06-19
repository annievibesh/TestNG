package Insurance;

import org.testng.annotations.Test;

public class LifeInsurance {
	@Test(priority=1)
	public void WebLoginLifeInsurance()
	{
		System.out.println("Life Insurance Web login");
	}
	@Test(priority=2)
	public void WebLogoutLifeInsurance()
	{
		System.out.println("Life Insurance Web logout");
	}
	@Test(priority=3)
	public void mobileLoginLifeInsurance()
	{
		System.out.println("Life Insurance Mobile login");
	}
	@Test(priority=4)
	public void mobileLogoutLifeInsurance()
	{
		System.out.println("Life Insurance Mobile logout");
	}
	

}
