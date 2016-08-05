package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintest extends constants
{
	@Test
	public void logintestcase()
	{
		driver.get(lp.url);
		System.out.println(lp.u+"--"+lp.p);
		driver.manage().window().maximize();
		lp.Login(lp.u, lp.p);
		
		ap.welcomeadminclick();
		ap.logoutclick();
		
		driver.close();
	}

	

}
