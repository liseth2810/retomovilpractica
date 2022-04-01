package com.liseth2810.app.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target TXT_EMAIL = Target.the("email field").located(By.id("usernameTextField"));
    public static final Target TXT_PASS = Target.the("Password field").located(By.id("passwordTextField"));
    public static final Target BNT_SIGN_IN = Target.the("Button field login").located(By.id("loginButton"));

}
