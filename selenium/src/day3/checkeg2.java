package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkeg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> check=block.findElements(By.tagName("input"));
		
		for (int i = 0; i < check.size(); i++)
		{
			String checktext=check.get(i).getAttribute("value");
			System.out.println(checktext);
			
			if (!check.get(i).isSelected()) 
			{
				check.get(i).click();
			}
		}

	}

}
