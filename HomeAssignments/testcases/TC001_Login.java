package week7.day2.HomeAssignments.testcases;

import org.testng.annotations.Test;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;
import week7.day2.HomeAssignments.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod {
	
	@Test
	public void runLogin() 
	{
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin();
	}

}
