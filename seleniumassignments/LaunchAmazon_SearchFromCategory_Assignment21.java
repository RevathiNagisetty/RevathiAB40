package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchAmazon_SearchFromCategory_Assignment21
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(category_dd);
		s.selectByValue("search-alias=stripbooks");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World War");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
