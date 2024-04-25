package seleniumassignments;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchAmazonMozilla_Assignment8 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
