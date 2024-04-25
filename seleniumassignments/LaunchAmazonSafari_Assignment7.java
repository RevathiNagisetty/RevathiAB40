package seleniumassignments;

import org.openqa.selenium.safari.SafariDriver;

public class LaunchAmazonSafari_Assignment7 
{
	public static void main(String[] args) 
	{
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
