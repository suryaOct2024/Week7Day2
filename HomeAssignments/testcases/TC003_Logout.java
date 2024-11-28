package week7.day2.HomeAssignments.testcases;

import org.testng.annotations.Test;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;
import week7.day2.HomeAssignments.pages.LoginPage;

public class TC003_Logout extends ProjectSpecificMethod {
	
	@Test
	public void runLogout()
	{
		
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickLogout();
		
	}

}
