package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegister_Assignment14 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");		
	}
}
