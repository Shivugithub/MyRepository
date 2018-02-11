package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefn {
	WebDriver driver;
	@Given("^I am able to access the magento web page$")
	public void i_am_able_to_access_the_magento_web_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.partialLinkText("MY ACCOUNT")).click();
	}

	@Given("^I am a registerd user on magento$")
	public void i_am_a_registerd_user_on_magento() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
	}
	
	@When("^I update the valid username$")
	public void i_update_the_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("natarajan.ramanathan93@gmail.com");
	}
	
	@When("^I update the valid password$")
	public void i_update_the_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	}
	
	@When("^I click on the SignIn buttons$")
	public void i_click_on_the_SignIn_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("send2")).click();
	}
	
	@Then("^I should get access to the dashboard$")
	public void i_should_get_access_to_the_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertTrue(driver.findElement(By.linkText("Log Out")).isDisplayed());
		driver.quit();
	}

	@When("^I update the valid username as \"([^\"]*)\"$")
	public void i_update_the_valid_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(arg1);
	}
	
	@When("^I update the valid password as \"([^\"]*)\"$")
	public void i_update_the_valid_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys(arg1);
		
	}
	
	
}
