package Insurance;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VehicleInsurance {
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Welcome");
	}
	@Test(priority = 1)
	public void WebLoginVehicleInsurance() {
		System.out.println("Vehicle Insurance Web login");
	}

	@Test(priority = 2)
	public void WebLogoutVehicleInsurance() {
		System.out.println("Vehicle Insurance Web logout");
	}

	@Test(priority = 3)
	public void mobileLoginVehicleInsurance() {
		System.out.println("Vehicle Insurance Mobile login");
	}

	@Test(enabled = false)
	public void mobileLogoutVehicleInsurance() {
		System.out.println("Vehicle Insurance Mobile logout");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Happy Learning");
	}
}
