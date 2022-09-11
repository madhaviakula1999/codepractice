package com.epam.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.Utils.Constants;

public class SigninPage extends PageFactorySetUp {

	public SigninPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email")
	WebElement emailInputForSignIn;

	@FindBy(id = "pass")
	WebElement passwordInputForSignIn;

	@FindBy(name = "login")
	WebElement signInSubmitButton;

	public void openBrowser() {
		driver.get(Constants.LoginURl);
		driver.manage().window().maximize();
	}

	public void signinDetails() {
		emailInputForSignIn.sendKeys(Constants.UserEmail);
		passwordInputForSignIn.sendKeys(Constants.Password);
	}

	public void clickOnLogin() {
		signInSubmitButton.click();
	}

}
