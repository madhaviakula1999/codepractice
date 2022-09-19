package stepdefinitions;

import org.testng.annotations.Test;

import com.epam.restservices.Services;

import io.cucumber.java.en.Given;

public class RestServicesStepDef {

	private Services services = new Services();

	@Test
	@Given("I send the GET request to the end point url")
	public void enter_login_details() {
		services.usingPathParam();

	}

}
