package com.orgHRM.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro 
{
	public static WebDriver driver;
	
	@Test(dataProvider="data")
	public void brtest(String br,String url)
	{
		
		if (br.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] d=new Object[3][2];
		
		d[0][0]="firefox";
		d[0][1]="http://orangehrm.qedgetech.com";
		
		d[1][0]="chrome";
		d[1][1]="http://orangehrm.qedgetech.com";
		
		d[2][0]="ie";
		d[2][1]="http://orangehrm.qedgetech.com";
		
		return d;
	}

}
