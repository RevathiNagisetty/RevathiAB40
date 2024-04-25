package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMinds_SelectDropDown_Assignment23 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement dd = driver.findElement(By.id("Choice1"));
		Select s = new Select(dd);
		s.selectByVisibleText("Demo2");
	}
}
