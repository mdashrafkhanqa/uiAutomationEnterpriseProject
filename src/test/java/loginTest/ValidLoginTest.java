package loginTest;

import base.ScriptBase;
import controller.Login;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {
    Login login;

    @Test (priority = 1)
    public void verifyValidSignIn() throws InterruptedException {
        login = new Login(driver);
        login.validLogin(driver,"tangail007@gmail.com","Admin12345");
    }
}
