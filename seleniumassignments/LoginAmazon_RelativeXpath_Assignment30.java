package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon_RelativeXpath_Assignment30 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("nagisettyrevathi@gmail.com");
		driver.findElement(By.xpath("(//input)[10]")).click();
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("chinnu2712");
		driver.findElement(By.xpath("(//input)[11]")).click();
	}
}
