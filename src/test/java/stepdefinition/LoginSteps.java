package stepdefinition;

import org.testng.Assert;

import base.baseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.loginpage;

public class LoginSteps extends baseTest {
	
	loginpage login;
	
	@Given("I am on the login page")
	public void entertologin()
	{
		login = new loginpage(driver,wait);
	}
	
	@When("I enter invalid username and password and click the login button")
	public void passinginvalidvalues() throws InterruptedException
	{
		login.enterUsernamePassword("invalidusername", "invalidpassword");
	}
	
	@Then("stay on the login page")
	public void stayonloginpage()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"), "user should stay on the login page");
	}
	
	@When("I enter valid username and password and click on login button")
	public void passingvalidvalues() throws InterruptedException
	{
		login.enterUsernamePassword("www.alanchacko596@gmail.com","12345678");
	}
	
	@Then("I should redirected to the Dashboard page")
	public void redirectDashboard()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("accoun"), "user should redirect to dashboard");	
	}

}
