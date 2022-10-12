package androidTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static androidTests.CommonActions.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTests extends TestBase {

    @Test
    void appStarted() {
        System.out.println("App started...");
    }

    @Test
    @DisplayName("Login Test")
    public void positiveFirstTimeLoginTest() {
        //open app and try SignIn
        openWiliotApp();

        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);

        //Check result
        USER_FROM_LIST.click();

        //logout
        logout();
    }

    @Test
    @DisplayName("Login Test")
    public void logoutTest() {
        //open app and try SignIn
        openWiliotApp();
        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);
        //Check result
        USER_FROM_LIST.click();
        //logout
        logout();
    }

    @Test
    void tapAndHold() {
        //clearChrome();
        openWiliotApp();
    }
}
