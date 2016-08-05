package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg2 {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://192.168.1.100/primusbank1");
		d.findElement(By.linkText("Site Map")).click();
		WebElement b=d.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		
		List<WebElement> links=b.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(d.getTitle()+"---"+d.getCurrentUrl());
			d.navigate().back();
			b=d.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul"));
			links=b.findElements(By.tagName("a"));
		}

	}

}
