package com.liseth2810.app.screenplay.tasks;

import com.liseth2810.app.screenplay.models.User;
import com.liseth2810.app.screenplay.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.liseth2810.app.screenplay.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    private User user;

    public Login(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUser()).into(TXT_EMAIL),
                Enter.theValue(user.getPassword()).into(TXT_PASS),
                Click.on(BNT_SIGN_IN)
        );
    }

    public static Login the(User user) {
        return instrumented(Login.class, user);
    }

}

