package seleniumassignments;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchAmazonTitleQuit_Assignment6
{
	public static void main(String[] args) 
	{
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
