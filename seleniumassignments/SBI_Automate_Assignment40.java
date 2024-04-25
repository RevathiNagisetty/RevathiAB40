package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBI_Automate_Assignment40
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/newuserreg.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name = 'nextStep']")).click();
		driver.findElement(By.name("accountNo")).sendKeys("2323453");
		driver.findElement(By.name("cifNo")).sendKeys("6478678");
		driver.findElement(By.name("branchCode")).sendKeys("242");
		WebElement country = driver.findElement(By.name("countryCode"));
		Select s = new Select(country);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name = 'mobileNo']")).sendKeys("2345678909");
		WebElement Facility_required = driver.findElement(By.name("txnRights"));
		Select s1 = new Select(Facility_required);
		s1.selectByIndex(1);
		driver.findElement(By.id("iAgreeconsent")).click();
	}
}
