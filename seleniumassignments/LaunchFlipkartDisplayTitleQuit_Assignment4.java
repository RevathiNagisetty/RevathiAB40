package seleniumassignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkartDisplayTitleQuit_Assignment4
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
