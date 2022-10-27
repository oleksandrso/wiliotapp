package iOS.tests;

import iOS.testsConfig.iosTestBase;
import io.appium.java_client.AppiumBy;
import net.bytebuddy.build.Plugin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static iOS.iosCommonActions.login;
import static iOS.iosCommonActions.logout;
import static iOS.pageObgects.LoginPage.FORGOT_PASSWORD_BUTTON;

public class LoginTests extends iosTestBase {


    @Test
    @DisplayName("Login Test")
    public void positiveFirstTimeLoginTest() {
        String LOGIN = "autotest_new@wiliot.com", PASSWORD = "!Qxys83=!NaPEOF-QLM]";
//        String LOGIN = "oleksandr.sotnichenko@wiliot.com", PASSWORD = "Sasha93sot09!";
        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);
    }

    @Test
    void logoutTest() {
        logout();
    }

    @Test
    void forgotPasswordLoginPage() {
        FORGOT_PASSWORD_BUTTON().click();
        $(AppiumBy.accessibilityId("Forgot your password? Type in your email address in the form below to reset your password.")).shouldBe(visible);
    }
}
