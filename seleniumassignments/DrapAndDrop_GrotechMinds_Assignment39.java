package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop_GrotechMinds_Assignment39 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();		
		WebElement drag_element = driver.findElement(By.xpath(("(//div[@id = 'div1'])[10]")));		
		WebElement drop_element = driver.findElement(By.xpath("//div[@id = 'div2']"));	
		Thread.sleep(4000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag_element, drop_element).perform();
	}
}
