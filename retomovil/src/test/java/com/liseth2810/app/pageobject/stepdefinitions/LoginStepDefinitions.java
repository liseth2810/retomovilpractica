package com.liseth2810.app.pageobject.stepdefinitions;

import com.liseth2810.app.pageobject.steps.AUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    AUser Liseth;

    @When("^liseth login to the Eribank application with company and company$")
    public void lisethLoginToTheEribankApplicationWithCompanyAndCompany( String user, String password) throws Throwable  {
        Liseth.tryToLogin(user, password);
    }

}
