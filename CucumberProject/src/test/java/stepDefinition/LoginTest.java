package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;


	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		System.out.println("User is on Home Page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("kate26");
		driver.findElement(By.name("password")).sendKeys("test02");
		driver.findElement(By.name("login")).click();
		System.out.println("User enters username and password");
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("user logged in successfully");
	}
}
