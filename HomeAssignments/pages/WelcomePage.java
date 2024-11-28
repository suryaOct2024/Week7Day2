package week7.day2.HomeAssignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public WelcomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage clickLogout()
	{
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPage(driver);
	}
	
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
