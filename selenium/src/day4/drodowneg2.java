package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drodowneg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://khuranatravel.com");
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fdrop=driver.findElement(By.id("fromCity"));
		
		Select f=new Select(fdrop);
		
		List<WebElement> flist=f.getOptions();
		System.out.println(flist.size());
		
		
		WebElement tdrop=driver.findElement(By.id("toCity"));
		Select t=new Select(tdrop);
		
		
		for (int i = 0; i < flist.size(); i++)
		{
			f.selectByIndex(i);
			String fcText=flist.get(i).getText();
			System.out.println(fcText);
			
			
			List<WebElement> tlist=t.getOptions();
			
			for (int j = 0; j < tlist.size(); j++) 
			{
				t.selectByIndex(j);
				String tcText=tlist.get(j).getText();
				
				if (fcText.equalsIgnoreCase(tcText))
				{
					System.out.println("Fail");
				}
			}
			
		}
		

	}

}
