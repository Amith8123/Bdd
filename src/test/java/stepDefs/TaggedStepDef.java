package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef {
	@Before("@SmokeTest")
	public void initEdge() {
	    System.out.println("Edge Before all the Scenarios");
	}
	@Before("@Regression")
	public void initChrome() {
	    System.out.println("Chrome Before all the Scenarios");
	}
	
	
	@BeforeAll
	public static void setup() {
	    System.out.println("Before all the Scenarios");
	}
	@Before
	public void eachScenario() {
	    System.out.println("Before each of the Scenarios");
	}
	@BeforeStep
	public void eachStep() {
	    System.out.println("Before each of the Step");
	}
	@AfterAll
	public static void tearDown() {
	    System.out.println("After all the Scenarios");
	}
	
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("user_is_logged_in");
	}
	@When("User update a deal")
	public void user_update_a_deal() {
		System.out.println("user_update_a_deal");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("user_delete_a_contact");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User update a contact")
	public void user_update_a_contact() {
		System.out.println("user_update_a_contact");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User delete a deal")
	public void user_delete_a_deal() {
		System.out.println("user_delete_a_deal");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User create a contact")
	public void user_create_a_contact() {
		System.out.println("user_create_a_contact");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User delete a task")
	public void user_delete_a_task() {
		System.out.println("user_delete_a_task");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User create a deal")
	public void user_create_a_deal() {
		System.out.println("user_create_a_deal");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User create a task")
	public void user_create_a_task() {
		System.out.println("user_create_a_task");
	}
//	@Given("User is logged in")
//	public void user_is_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("User update a task")
	public void user_update_a_task() {
		System.out.println("user_update_a_task");;
	}
	
	
}
