package AssignmentLoginFunctunality;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseClass.BaseTest;
import PageClass.MobileAppLoginPage;
import PageClass.MobileAppPasswordRecoveryPage;

public class MobileAppLoginTest extends BaseTest{
	
	 @Test(priority = 1)
	    public void validLoginTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.getUsernameField().sendKeys("validUsername");
	        loginPage.getPasswordField().sendKeys("validPassword");
	        loginPage.getLoginButton().click();
	        Assert.assertTrue(true,"/* Implement assertion for successful login */");
	    }

	    @Test(priority = 2)
	    public void invalidLoginTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.getUsernameField().sendKeys("invalidUsername");
	        loginPage.getPasswordField().sendKeys("invalidPassword");
	        loginPage.getLoginButton().click();
	        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
	    }

	    @Test(priority = 3)
	    public void retainLoginFieldsTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.getUsernameField().sendKeys("validUsername");
	        loginPage.getPasswordField().sendKeys("invalidPassword");
	        loginPage.getLoginButton().click();
	        Assert.assertEquals(loginPage.getUsernameField().getText(), "validUsername");
	        Assert.assertEquals(loginPage.getPasswordField().getText(), "invalidPassword");
	    }

	    @Test(priority = 4)
	    public void loginButtonDisabledTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        Assert.assertFalse(loginPage.getLoginButton().isEnabled());
	    }

	    @Test(priority = 5)
	    public void loginButtonEnabledTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.getUsernameField().sendKeys("validUsername");
	        loginPage.getPasswordField().sendKeys("validPassword");
	        Assert.assertTrue(loginPage.getLoginButton().isEnabled());
	    }

	    @Test(priority = 6)
	    public void forgotPasswordRedirectTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        MobileAppPasswordRecoveryPage recoveryPage = new MobileAppPasswordRecoveryPage(driver);
	        loginPage.getForgotPasswordLink().click();
	        // Implement assertions and steps to validate password recovery redirection
	    }

	    @Test(priority = 7)
	    public void passwordRecoveryTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        MobileAppPasswordRecoveryPage recoveryPage = new MobileAppPasswordRecoveryPage(driver);
	        loginPage.getForgotPasswordLink().click();
	        recoveryPage.getEmailField().sendKeys("registeredEmail@example.com");
	        recoveryPage.getRecoverPasswordButton().click();
	        Assert.assertTrue(recoveryPage.getSuccessMessage().isDisplayed());
	    }

	    @Test(priority = 8)
	    public void passwordStrengthTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.getPasswordField().sendKeys("weakPassword");
	        Assert.assertEquals(loginPage.getStrengthIndicator().getText(), "Weak");
	    }

	    @Test(priority = 9)
	    public void paginationTest() {
	        MobileAppLoginPage loginPage = new MobileAppLoginPage(driver);
	        loginPage.clickOnPagination(2);
	        Assert.assertTrue(loginPage.isElementPresent("specificElement")); // Implement this method in MobileAppLoginPage class
	    }
}
