package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Html_XpathRelative 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chinnu/Desktop/learningHTML1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Revathi");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("chinnu287");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Revathi Devi");
		driver.findElement(By.xpath("(//input)[7]")).click();
		driver.findElement(By.xpath("(//input)[12]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		Select s = new Select(dropdown);
		s.selectByIndex(3);
	}

}
