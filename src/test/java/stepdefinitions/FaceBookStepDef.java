package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.epam.pom.HomePage;
import com.epam.pom.SigninPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookStepDef {
	WebDriver driver;
	SigninPage signIn;
	HomePage homepage;


	@Test(priority = 1)
	@Given("i open the facebook page")
	public void i_open_the_browser() {
		WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
		SigninPage.openBrowser(driver);
	}

	@Test(priority = 2)
	@And("i Enter username and password")
	public void enter_login_details() {
		SigninPage.loginDetails(driver);
	}
	
	@Test(priority = 3)
	@When("I click on login button")
	public void click_login() {
		SigninPage.clickOnLogin(driver);
	}
	
	@Test(priority = 4)
    @Then("I want to see the home page")
	public void see_home_page() {
    	HomePage.homePageShouldBevisible(driver);
	}
	
	@Test(priority = 4)
    @Then("I want to search the person in home page")
   	public void search_person() {
       	HomePage.enterTextInsearchbar(driver);
   	}
    

}





















