package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_Xpath_Assignment29
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		 
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Revathi");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("chinnu2712");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Revathi Devi");		
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		WebElement dropdown = driver.findElement(By.xpath("/html/body/select"));
		Select s = new Select(dropdown);
		s.selectByIndex(3);
	}
}
