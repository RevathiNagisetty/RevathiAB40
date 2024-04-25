package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> list_ele = driver.findElements(By.xpath("//div[@class = 'two-pane-results-container']/div/div"));
		System.out.println(list_ele);
		list_ele.get(5).click();
	}
}
