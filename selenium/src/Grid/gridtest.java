package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gridtest 
{
	@Parameters("browser")
	@Test
	public void grid(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox")) 
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		
		
		WebDriver driver=new RemoteWebDriver(new URL("http://10.172.0.3:4444/wd/hub"), cap);
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String radiotext=radios.get(i).getAttribute("value");
			System.out.println(radiotext);
			switch (radiotext) 
			{
			case "Milk":
				radios.get(i).click();
				break;
				
			case "Beer":
				radios.get(i).click();
				break;
			}
		}
		
		
		
		
		
	}

}
