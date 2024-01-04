package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileAppPasswordRecoveryPage {

	 private final WebDriver driver;

	 public MobileAppPasswordRecoveryPage(WebDriver driver) {
	        this.driver = null;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }

	    @AndroidFindBy(id = "emailField")
	    private WebElement emailField;

	    @AndroidFindBy(id = "recoverPasswordButton")
	    private WebElement recoverPasswordButton;

	    @AndroidFindBy(id = "successMessage")
	    private WebElement successMessage;
	    
	    public WebElement getEmailField() {
	    	return emailField;
	    }

	    public WebElement getRecoverPasswordButton() {
	        return recoverPasswordButton;
	    }
	    
	    public WebElement getSuccessMessage() {
	    	return successMessage;
	    }

}
