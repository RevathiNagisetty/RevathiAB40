package seleniumassignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import seleniumpractice.ScreenShot;

public class FileException_Assignment42
{

	public static void main(String[] args) throws IOException 
	{
		//FileNotFoundException
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);		
		Date d = new Date();
		String name= new ScreenShot().getClass().toString();
		String[] sc_name = name.split("\\.");
		String scname = sc_name[1] +"_" + new Date(d.getTime()).toString();
		//String scname1 =scname.replaceAll("\\s+","");
		
		String[] date_sep = scname.split(" ");
		String time = date_sep[3].replace(":", "");
		scname = date_sep[0] +"-" + date_sep[1] +"-"+ date_sep[2] + "-" + time;	
		System.out.println(scname);		
		//System.out.println(name1[1]);
		//File Destination = new File("C:\\Users\\Chinnu\\eclipse-workspace\\SeleniumProject\\src\\image" + Math.random() +".png");
		//File Destination = new File("C:\\Users\\Chinnu\\eclipse-workspace\\SeleniumProject\\src\\" +new ScreenShotName_Unique().getClass() +".png");
		File Destination = new File("M:\\Users\\Chinnu\\eclipse-workspace\\SeleniumProject\\src\\" + scname + ".png");
		FileHandler.copy(source, Destination);
	}
}
