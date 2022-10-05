package androidTests;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static androidTests.TestData.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTests extends TestBase{

    @Test
    @DisplayName("Login Test")
    public void positiveLoginTest(){


        //open app and try SignIn
        $(MobileBy.accessibilityId("Wiliot")).click();
        $(MobileBy.id("com.easternpeak.wiliot:id/btnSignIn")).click();
        sleep(1000);

        //Send Login And Password
        LOGIN_FIELD.sendKeys(LOGIN);
        PASSWORD_FIELD.sendKeys(PASSWORD);
        SUBMIT_BUTTON.click();
        sleep(1000);

        //Check result
        $(MobileBy.id("com.easternpeak.wiliot:id/alertTitle")).shouldHave(text("Pick an Account"));

    }
}
