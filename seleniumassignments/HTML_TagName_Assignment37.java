package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_TagName_Assignment37 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chinnu/Desktop/learningHTML1.html");
		driver.findElement(By.tagName("a")).click();
	}
}
