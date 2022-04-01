package com.liseth2810.app.pageobject.steps;

import com.liseth2810.app.pageobject.pages.HomePage;
import com.liseth2810.app.pageobject.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AUser {

    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;

    @Step
    public void tryToLogin(String username, String password) {
        loginPage.tryLogin(username, password);
    }

    @Step
    public void shouldSeeHomePage() {
        assertThat(homePage.isButtonMakePaymentVisible(), is(true));
    }

}
