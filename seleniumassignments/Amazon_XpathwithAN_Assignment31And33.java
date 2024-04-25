package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_XpathwithAN_Assignment31And33
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		Select s = new Select(dropdown);
		s.selectByIndex(11);
		WebElement search = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		search.sendKeys("World War");
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
	}
}
