package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_UsingXpathText_Assignment32
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?");
		WebElement google_signin = driver.findElement(By.xpath("//span[. = 'Google']"));
		google_signin.click();
	}

}
