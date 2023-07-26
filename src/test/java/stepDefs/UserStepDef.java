package stepDefs;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
//	@When("User should enter credentials")
//	public void user_should_enter_credentials() {
//	    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
//	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//	    driver.findElement(By.cssSelector("fa fa-2x fa-sign-in")).click();
//	       	
//		
//	}
//	@When("User should enter {string} and {string}")
//	public void user_should_enter_and(String strUsr, String strPwd) {
//		driver.findElement(By.cssSelector("#username")).sendKeys(strUsr);
//	    driver.findElement(By.id("password")).sendKeys(strPwd);
//	    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//	    
//	}
	
	//Data Table List if List
//	@When("User should enter login credentials")
//	public void user_should_enter_login_credentials(DataTable dataTable) {
//	  List<List<String>> users=dataTable.asLists();
//	  String strUser= users.get(0).get(0);
//	  String strPwd= users.get(0).get(1);
//	  driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
//	    driver.findElement(By.id("password")).sendKeys(strPwd);
//	    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//	    
//	}
	@When("User should enter login credentials")
	public void user_should_enter_login_credentials(DataTable dataTable) {
	  List<Map<String, String>> users=dataTable.asMaps();
	  String strUser= users.get(0).get("username");
	  String strPwd= users.get(0).get("password");
	  driver.findElement(By.cssSelector("#username")).sendKeys(strUser);
	    driver.findElement(By.id("password")).sendKeys(strPwd);
	    driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}
	@Then("Should Display Home Page")
	public void should_display_home_page() {
		boolean isValidUser=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		 assertTrue(isValidUser);
	}

}


