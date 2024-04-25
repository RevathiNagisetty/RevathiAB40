package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechMindsKeysControl_Assignment25And35 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement first_name = driver.findElement(By.id("fname"));
		first_name.sendKeys("Revathi");
		first_name.sendKeys(Keys.CONTROL+"a");
		first_name.sendKeys(Keys.CONTROL+"c");		
		WebElement last_name = driver.findElement(By.id("lname"));
		last_name.sendKeys(Keys.CONTROL+"v");
	}
}
