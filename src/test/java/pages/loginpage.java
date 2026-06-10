package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public loginpage(WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		
	}
	
	By username = By.id("customer_email");
	By password = By.id("customer_password");
	By LoginClick = By.xpath("//input[@value='Sign In']");
	
	public void enterUsernamePassword(String user, String pass) throws InterruptedException
	{
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		usernameField.sendKeys(user);
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		passwordField.sendKeys(pass);
		Thread.sleep(3000);
		WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(LoginClick));
		loginbutton.click();
		
		
	}

}
