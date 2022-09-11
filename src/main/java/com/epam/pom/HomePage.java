package com.epam.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.Utils.Constants;

public class HomePage  {

	@FindBy(id = "//input[@placeholder=\\\"Search Facebook\\\"][0]")
	WebElement homePage;

	public void homePageShouldBevisible() {
		// TODO Auto-generated method stub
		homePage.isDisplayed();
	}

	public void enterTextInsearchbar() {
		// TODO Auto-generated method stub
		homePage.sendKeys(Constants.searchText);
	}

}
