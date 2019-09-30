package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTagsTest {
	@Given("Test one background")
	public void test_one_background() {
	   System.out.println("Test one background");
	}

	@When("Test two background")
	public void test_two_background() {
		 System.out.println("Test two background");
	}

	@Then("Test Three Background")
	public void test_Three_Background() {
		 System.out.println("Test three background");
	}

	@Given("Its a Smoke first step")
	public void its_a_Smoke_first_step() {
		 System.out.println("Its a Smoke first step");
	}

	@When("Its a Smoke second step")
	public void its_a_Smoke_second_step() {
		 System.out.println("Its a Smoke second step");
	}

	@Then("Its a Smoke third step")
	public void its_a_Smoke_third_step() {
		 System.out.println("Its a Smoke third step");
	}

	@Given("Its a Regression first step")
	public void its_a_Regression_first_step() {
		 System.out.println("Its a Regression first step");
	}

	@When("Its a Regression second step")
	public void its_a_Regression_second_step() {
		 System.out.println("Its a Regression second step");
	}

	@Then("Its a Regression third step")
	public void its_a_Regression_third_step() {
		 System.out.println("Its a Regression third step");
	}

	@Given("Its an Integration first step")
	public void its_an_Integration_first_step() {
		 System.out.println("Its an Integration first step");
	}

	@When("Its an Integration second step")
	public void its_an_Integration_second_step() {
		 System.out.println("Its an Integration second step");
	}

	@Then("Its an Integration third step")
	public void its_an_Integration_third_step() {
		 System.out.println("Its an Integration third step");
	}

}
