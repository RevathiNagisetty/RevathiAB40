package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookSignIn_Assignment10 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("nagisettyrevathi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Chinnu@2712");
		driver.findElement(By.name("login")).click();
	}
}
