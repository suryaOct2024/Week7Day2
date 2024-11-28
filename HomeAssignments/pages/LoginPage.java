package week7.day2.HomeAssignments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week7.day2.HomeAssignments.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}

}
