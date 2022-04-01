package com.liseth2810.app.screenplay.stepdefinitions;


import com.liseth2810.app.screenplay.models.User;
import com.liseth2810.app.screenplay.questions.SeeHomePage;
import com.liseth2810.app.screenplay.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^liseth login to the Eribank application with company and company$")
    public void lisethLoginToTheEribankApplicationWithCompanyAndCompany(List<User>credentials) throws InterruptedException {
        theActorInTheSpotlight().wasAbleTo(
                Login.the(credentials.get(0))
        );
    }

    @Then("^liseth visualizes her balance$")
    public void lisethVisualizesHerBalance() throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SeeHomePage.isVisible()));
    }

}
