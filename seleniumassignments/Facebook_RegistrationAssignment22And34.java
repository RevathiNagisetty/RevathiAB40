package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_RegistrationAssignment22And34
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//input[@name = 'firstname']")).sendKeys("Revathi");
		driver.findElement(By.xpath("//div//input[@name = 'lastname']")).sendKeys("Nagisetty");	
		driver.findElement(By.xpath("//div//input[@name = 'reg_email__']")).sendKeys("nagisettyrevathi@gmail.com");	
		driver.findElement(By.xpath("//div//input[@name = 'reg_passwd__']")).sendKeys("chinnu27");	
		driver.findElement(By.xpath("//span/select[@name = 'birthday_month']")).sendKeys("June");	
		driver.findElement(By.xpath("//span/select[@name = 'birthday_day']")).sendKeys("20");	
		driver.findElement(By.xpath("//span/select[@name = 'birthday_year']")).sendKeys("1990");	
		driver.findElement(By.xpath("//span/label[1]")).click();
		driver.findElement(By.xpath("//div[@class = '_1lch']/button")).click();		
	}
}
