package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonArrowManuallyUsingKeys_Assignment26And36
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search_dd = driver.findElement(By.id("searchDropdownBox"));
		for(int i = 0; i<11; i++)
		{
			search_dd.sendKeys(Keys.ARROW_DOWN);
		}
		search_dd.sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World War");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}
}
