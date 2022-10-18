package androidTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static androidTests.CommonActions.*;
import static com.codeborne.selenide.Condition.visible;

public class LoginTests extends TestBase {


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
    @DisplayName("Logout Test")
    public void logoutTest() {
        //open app and try SignIn
        openWiliotApp();
        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);
        //Check result
        USER_FROM_LIST.click();
        //logout
        logout();
        //check logout on chrome
        LOGIN_FIELD.shouldBe(visible);//-?
    }


}
