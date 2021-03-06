package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By locators:
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signinButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.xpath("//a[contains(text(),'Forgot your password?')]");

	// 2. constructor of the page class:

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean doesForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUsername(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnSignInBttn() {
		driver.findElement(signinButton).click();
	}
}
