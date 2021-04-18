package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ContactUsPageFunctionality {

	WebDriver driver = null;
	
	@Given("user is in TFT homepage")
	public void user_is_in_tft_homepage() {
	  
		System.setProperty("webdriver.chrome.driver","/Users/fahad/Desktop/Java workspace/TFTProdTesting/src/test/resources/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://transfotechacademy.com/");
	
	}

	@When("click contact us button")
	public void click_contact_us_button() {

		driver.findElement(By.linkText("Blogs")).click();
		
	}

	@Then("user navigate to contact us page")
	public void user_navigate_to_contact_us_page() {
	
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}
	
	
	
	
}
