package week7.day2.HomeAssignments.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
