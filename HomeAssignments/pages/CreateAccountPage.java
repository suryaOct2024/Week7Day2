package week7.day2.HomeAssignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {
	
	public CreateAccountPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateAccountPage enterAcctName()
	{
		
		driver.findElement(By.id("accountName")).sendKeys("TestLeafTestUserAccount");
		return this;
	}
	
	public ViewAccountPage clickCreateAccountButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
	}

}
