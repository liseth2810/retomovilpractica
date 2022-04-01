package com.liseth2810.app.pageobject.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "usernameTextField")
    private WebElement user;
    @FindBy(id = "passwordTextField")
    private WebElement password;
    @FindBy(id = "loginButton")
    private WebElement buttonLogin;

    private void enterValueOn(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    private void clickOnLogin() {
        buttonLogin.click();
    }

    public void tryLogin(String username, String password) {
        enterValueOn(this.user, username);
        enterValueOn(this.password, password);
        clickOnLogin();
    }

}
