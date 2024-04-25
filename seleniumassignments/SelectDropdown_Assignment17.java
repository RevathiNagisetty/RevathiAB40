package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown_Assignment17
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement category_dd = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(category_dd);
		s.selectByIndex(2);	
	}
}
