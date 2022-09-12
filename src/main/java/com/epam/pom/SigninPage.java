package com.epam.pom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import com.epam.Utils.Constants;
import com.epam.log.Log;

public class SigninPage extends PageFactorySetUp {

	public SigninPage(WebDriver driver) {
		super(driver);
	}

	Logger Mylogger = LogManager.getLogger("DebugLogger");

	@FindBy(id = "email")
	WebElement emailInputForSignIn;

	@FindBy(id = "pass")
	WebElement passwordInputForSignIn;

	@FindBy(name = "login")
	WebElement signInSubmitButton;

	@FindBy(xpath = "//a[contains(text(),'Forgotten password?')]")
	WebElement incorrectpswText;

	public void openBrowser() {
		Log.info("Opening browser");
		driver.get(Constants.LoginURl);
		driver.manage().window().maximize();
		Log.info("login successful");
	}

	public void signinDetails() {
		emailInputForSignIn.sendKeys(Constants.UserEmail);
		passwordInputForSignIn.sendKeys(Constants.Password);
	}

	public void InvalidSigninDetails() {
		emailInputForSignIn.sendKeys(Constants.InValidUserEmail);
		passwordInputForSignIn.sendKeys(Constants.InvalidPassword);
	}

	public void InlineErrorMesssage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		incorrectpswText.isDisplayed();
	}

	/*
	 * public void signinDetails(final String username,final String password) {
	 * emailInputForSignIn.sendKeys(username);
	 * passwordInputForSignIn.sendKeys(password); }
	 */

	public void clickOnLogin() {
		signInSubmitButton.click();
	}

	public void closeDriver() {
		driver.quit();
	}

	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void highLightPassword() {
		highLightElement(passwordInputForSignIn); 
	}

	public void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
	}

}
