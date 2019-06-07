package task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder
{
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		int rowNum=1;
    	int colNum=1;
    	Filelib flib=new Filelib();
		// launch browser and navigate to url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> menus = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		
		for (int i = 0; i < menus.size(); i++) {
			WebElement m = menus.get(i);
			String value=m.getText().trim();
			System.out.println(""+value);
			flib.toExcelSheet("Sheet1", rowNum, colNum,value);
			rowNum++;
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(m).perform();
			List<WebElement> submenu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span[contains(text(),'" + m.getText()+"')]/following-sibling::div/div/ul/li/div/a"));
			Thread.sleep(2000);
			
			for (int j = 0; j <submenu.size(); j++)
			{
				WebElement sm = submenu.get(j);
				String value1=sm.getText().trim();
				System.out.println(value1);
				 flib.toExcelSheet("Sheet1", rowNum, colNum, value1);
        		 rowNum++;
				List<WebElement> subsubmenu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span[contains(text(),'Living')]/following-sibling::div/div/ul/li/div/a[text()='"+sm.getText()+"']/../../ul/li/a"));
				Thread.sleep(2000);
				
				for (int k=0;k<subsubmenu.size();k++)
				{
					WebElement list = subsubmenu.get(k);
					String value2=list.getText().trim();
					System.out.println(value2);
					 flib.toExcelSheet("Sheet1", rowNum, colNum, value2);
            		 rowNum++;
				}

			}
		}

	}
}
