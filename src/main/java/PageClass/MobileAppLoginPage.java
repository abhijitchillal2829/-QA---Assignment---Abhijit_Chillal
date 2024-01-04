package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileAppLoginPage {

	public MobileAppLoginPage(WebDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "username")
	private WebElement usernameField;

	@AndroidFindBy(id = "password")
	private WebElement passwordField;

	@AndroidFindBy(id = "loginButton")
	private WebElement loginButton;

	@AndroidFindBy(id = "errorMessage")
	private WebElement errorMessage;

	@AndroidFindBy(id = "forgotPasswordLink")
	private WebElement forgotPasswordLink;

	@AndroidFindBy(id = "strengthIndicator")
	private WebElement strengthIndicator;

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getStrengthIndicator() {
		return strengthIndicator;
	}

	public void clickOnPagination(int pageNumber) {

	}

	public boolean isElementPresent(String elementId) {

		return false;
	}

}
