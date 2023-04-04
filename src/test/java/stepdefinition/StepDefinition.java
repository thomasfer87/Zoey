package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("I want to write a step with precondition {string}")
	public void i_want_to_write_a_step_with_precondition(String string) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\User\\eclipse-workspace\\Zoey\\src\\test\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(string);

	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Step 2");
		
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("step3");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("step4");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("step5");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("step6");

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("step7");

	}

}
