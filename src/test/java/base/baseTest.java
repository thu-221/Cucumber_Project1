package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
		driver.get("https://sauce-demo.myshopify.com/account/login");
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
