package week7.day2.HomeAssignments.testcases;

import org.testng.annotations.Test;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;
import week7.day2.HomeAssignments.pages.LoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethod {
	
	@Test
	public void runCreateAccount()
	{
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickAccountsTab()
		.clickCreateAccountLink()
		.enterAcctName()
		.clickCreateAccountButton()
		.verifyAccount();
	}

}
