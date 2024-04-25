package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_AutoSuggestion_Assignment38
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");		
		WebElement searchbox = driver.findElement(By.xpath("//div[@Class = 'desktop-query']/input"));		
		searchbox.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> list_ele = driver.findElements(By.xpath("//div[@class = ' desktop-autoSuggest desktop-showContent']/ul/li"));
		System.out.println(list_ele.size());
		list_ele.get(3).click();
	}

}
