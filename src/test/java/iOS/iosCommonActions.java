package iOS;

import io.appium.java_client.ios.IOSDriver;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static iOS.pageObgects.AccountAppSettingsMenu.LOGOUT_BUTTON;
import static iOS.pageObgects.GeneralAppItems.ACCOUNT_BUTTON;
import static iOS.pageObgects.LoginPage.LOGIN_FIELD;
import static iOS.pageObgects.LoginPage.PASSWORD_FIELD;
import static iOS.pageObgects.LoginPage.SUBMIT_BUTTON;

public class iosCommonActions {

    static public void login(String login, String password) {
        sleep(5000);
        LOGIN_FIELD().click();
        LOGIN_FIELD().setValue(login);
        PASSWORD_FIELD().setValue(password);
        SUBMIT_BUTTON().click();
        sleep(4000);

    }

    static public void logout() {
        ACCOUNT_BUTTON().click();
        LOGOUT_BUTTON().click();
        sleep(10000);
        LOGIN_FIELD().isDisplayed();
    }
     static public void unlockDevice() {
         IOSDriver iosDriver=(IOSDriver) getWebDriver();
         iosDriver.unlockDevice();
    }



}
