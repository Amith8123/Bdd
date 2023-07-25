package stepDefs;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	 WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/login");
	}
	@When("User should enter credentials")
	public void user_should_enter_credentials() {
	    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.cssSelector("fa fa-2x fa-sign-in")).click();
			
		
	}
	@Then("Should Display Home Page")
	public void should_display_home_page() {
		boolean isValidUser=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		 assertTrue(isValidUser);
	}

}


