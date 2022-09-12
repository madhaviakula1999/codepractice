package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.epam.log.Log;
import com.epam.pom.HomePage;
import com.epam.pom.SigninPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookStepDef {
	WebDriver driver;

	private SigninPage signinpage;

	private HomePage homepage;

	@Test(priority = 1, invocationCount = 1)
	@Given("i open the facebook page")
	public void i_open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		signinpage = new SigninPage(driver);
		signinpage.openBrowser();
	}

	@Test(priority = 2, dependsOnMethods = "i_open_the_browser")
	@And("i Enter username and password")
	public void enter_login_details() {
		signinpage.signinDetails();
	}

	@And("i Enter invalid username and password")
	public void enter_Invalid_login_details() {
		signinpage.InvalidSigninDetails();
	}

	@Then("I want to see the inline error message")
	public void see_inline_Error_message() {
		signinpage.InlineErrorMesssage();
		signinpage.highLightPassword();
		Log.info("taking screenshot");
		try {
			signinpage.takeSnapShot(driver, "C:\\Users\\Madhavi_Akula\\publicgit\\codepractice\\screenshot.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * @Test(priority = 2,dependsOnMethods="i_open_the_browser")
	 * 
	 * @And("i Enter {string} and {string}") public void enter_login_details(final
	 * String username, final String password) {
	 * signinpage.signinDetails(username,password); }
	 */

	@Test(priority = 3)
	@When("I click on login button")
	public void click_login() {
		signinpage.clickOnLogin();
	}

	@Test(priority = 4)
	@Then("I want to see the home page")
	public void see_home_page() {
		homepage = new HomePage();
		homepage.homePageShouldBevisible();
	}

	@Test(priority = 5)
	@Then("I want to search the person in home page")
	public void search_person() {
		homepage.enterTextInsearchbar();
	}

	@AfterTest
	public void closeDriver() {
		signinpage.closeDriver();
	}
}
