package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_Orders_Assignment15 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Track packages")).click();
		driver.findElement(By.name("email")).sendKeys("nagisettyrevathi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Chinnu2712");
		driver.findElement(By.id("signInSubmit")).click(); 
	}
}
