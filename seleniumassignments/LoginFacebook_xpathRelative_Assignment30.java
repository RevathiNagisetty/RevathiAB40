package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook_xpathRelative_Assignment30
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("nagisettyrevathi@gmail.com");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Chinnu@2712");
		driver.findElement(By.xpath("//button")).click();
	}
}
