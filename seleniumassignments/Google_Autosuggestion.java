package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggestion
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");		
		List<WebElement> a1 = driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		int count = a1.size();
		System.out.println(count);
		a1.get(3).click();
	}
}
