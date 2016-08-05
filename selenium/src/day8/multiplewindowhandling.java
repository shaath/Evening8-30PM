package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class multiplewindowhandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while (it.hasNext())
		{
			String windowid =it.next();
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle()+"--------"+windowid);
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle());
			} 
			catch (Exception e) 
			{
				System.out.println("The expected link not available in the page");
			}
			
			
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
