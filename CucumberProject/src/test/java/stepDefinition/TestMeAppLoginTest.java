package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppLoginTest {
	WebDriver driver;
	@Given("User is on TestMeApp page")
	public void user_is_on_TestMeApp_page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[contains(.,'SignIn')]")).click();
		System.out.println("User is on TestMeApp Home Page");
	}

	@When("User enters {string} and {string} in TestMeApp")
	public void user_enters_and_in_TestMeApp(String user, String pass) {
	    driver.findElement(By.id("userName")).sendKeys(user);
	    driver.findElement(By.id("password")).sendKeys(pass);
	    driver.findElement(By.name("Login")).click();
	}

	@Then("Display message - Login is Successful")
	public void display_message_Login_is_Successful() throws InterruptedException {
	   System.out.println("Login is Successful");
	   driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
	}
}
