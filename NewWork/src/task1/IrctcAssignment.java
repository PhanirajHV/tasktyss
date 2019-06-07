package task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAssignment 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(set);
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//input[@name='From']")).click();
		
		List<WebElement> fromlist = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));
		
		int count = fromlist.size();
		String expcity = "Bengaluru";
		for (int i = 0; i <count; i++) 
		{
			//System.out.println(fromlist.get(i).getText());
			String actcity = fromlist.get(i).getText();
			
			System.out.println(actcity);
			if (expcity.contains(actcity)) 
			{
				fromlist.get(i).click();
			}
			
		}
		
	}
}
