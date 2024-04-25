package seleniumassignments;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFlipkartEdgeQuit_Assignment5 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
