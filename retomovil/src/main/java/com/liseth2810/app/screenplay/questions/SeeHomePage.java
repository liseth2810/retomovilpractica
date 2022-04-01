package com.liseth2810.app.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.liseth2810.app.screenplay.userinterfaces.HomePage.BNT_MAKE_PAYMENT;

public class SeeHomePage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BNT_MAKE_PAYMENT.resolveFor(actor).isVisible();
    }
    public static SeeHomePage isVisible() {
        return new SeeHomePage();
    }
    }

