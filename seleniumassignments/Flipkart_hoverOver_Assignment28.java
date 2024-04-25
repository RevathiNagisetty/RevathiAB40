package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverOver_Assignment28 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("(//span)[9]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(ele).perform();
		driver.findElement(By.linkText("Men's Casual Shirts")).sendKeys(Keys.ENTER);
	}
}
