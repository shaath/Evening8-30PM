package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) throws IOException 
	{
		String expval="Google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Evening8.30Pm\\selenium\\src\\screenshot\\google123.png"));

		}
		
	}

}
