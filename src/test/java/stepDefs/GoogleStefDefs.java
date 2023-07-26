package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStefDefs {
    WebDriver driver;
	@Given("User Launch Google Page")
	public void user_launch_google_page() {
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	    
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchText=driver.findElement(By.name("q"));
		searchText.sendKeys("Java Tutorial");
		searchText.submit();
	    
	}
	@Then("Should display Java Search result page")
	public void should_display_java_search_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	    
	}
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement searchText=driver.findElement(By.name("q"));
		searchText.sendKeys("Selenium Tutorial");
		searchText.submit();
	    
	}
	@Then("Should display Selenium Search result page")
	public void should_display_selenium_search_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	     
	}
	
	@When("User search Cypress Tutorial")
	public void user_search_cypress_tutorial() {
		WebElement searchText=driver.findElement(By.name("q"));
		searchText.sendKeys("Cypress Tutorial");
		searchText.submit();
	}
	
	@Then("Should display Cypress Search result page")
	public void should_display_Cypress_search_result_page() {
		Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search");
	     
	}
	
	@After
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen=(TakesScreenshot)driver;
			byte[] imgByte=screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgByte, "image/png", "ImageOne");
			}
		
	}
}
