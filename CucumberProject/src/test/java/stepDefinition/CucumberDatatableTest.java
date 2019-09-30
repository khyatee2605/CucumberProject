package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDatatableTest {
	WebDriver driver;
	@Given("User is on Heroku App Page")
	public void user_is_on_Heroku_App_Page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("User is on Home Page");
	}

	@When("User enters Heroku username and password")
	public void user_enters_Heroku_username_and_password(io.cucumber.datatable.DataTable usercred) {
		List<String> data=usercred.asList();
		driver.findElement(By.name("username")).sendKeys(data.get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(1));
		driver.findElement(By.xpath("//i[contains(.,'Login')]")).click();
	}

	@Then("display message user logged in successfully")
	public void display_message_user_logged_in_successfully() {
		System.out.println("user logged in successfully");
		driver.close();
	}
}
