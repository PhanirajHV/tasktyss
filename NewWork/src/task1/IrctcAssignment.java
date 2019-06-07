package task1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itrObj = set.iterator();
		String parentSessionid = itrObj.next();
		
		WebDriver driver1=driver.switchTo().window(parentSessionid);
		WebElement from = driver1.findElement(By.xpath("//input=[@id='stationFrom']"));
		from.click();
		from.sendKeys("banglore");
		List<WebElement> fromlist = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		int count = fromlist.size();
		String expcity = "Bengaluru";
		for (int i = 0; i <= count; i++) {
			String actcity = fromlist.get(i).getText();
			if (expcity.contains(actcity)) {
				fromlist.get(i).click();
			}
			
		}
		
	}
}
