package com.epam.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactorySetUp {
	public WebDriver driver;

	public PageFactorySetUp(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}
}

