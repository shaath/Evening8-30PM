package com.orgHRM.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orghrmlogin {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fi=new FileInputStream("F:\\Evening8.30Pm\\selenium\\src\\com\\orgHRM\\properties\\orghrm.properties");
		Properties pr=new Properties();
		pr.load(fi);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.id(pr.getProperty("login"))).click();
	}

}
