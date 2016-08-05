package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieLaunch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");

	}

}
