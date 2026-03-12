package BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
<<<<<<< HEAD
		driver.close();
		driver.quit();
	
	
=======
		driver.quit();
>>>>>>> 07db3dbdb7c2e3458e361d3a4dadaf53d17bbae6
	}
}