package week7.day2.HomeAssignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public MyAccountPage clickAccountsTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage(driver);
	}

}
