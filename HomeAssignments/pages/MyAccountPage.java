package week7.day2.HomeAssignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod {
	
	public MyAccountPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateAccountPage clickCreateAccountLink()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
	}

}
