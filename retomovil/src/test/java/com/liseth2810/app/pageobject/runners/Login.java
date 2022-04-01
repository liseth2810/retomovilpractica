package com.liseth2810.app.pageobject.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com.liseth2810.app.pageobject.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Login {

}
