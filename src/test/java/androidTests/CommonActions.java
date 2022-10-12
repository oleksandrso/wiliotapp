package androidTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonActions extends TestData {


    public static void clearChrome() {

    }

    public static void home() {
        ((AndroidDriver) getWebDriver()).pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public static void openWiliotApp() {
        home();
        actions().dragAndDropBy(DEVICE_HOME_SCREEN, 0, -1000).perform();
        WILIOT_APP_ICON.click();
    }

    static public void login(String login, String password) {
        LOGIN_FIELD.sendKeys(login);
        PASSWORD_FIELD.sendKeys(password);
        SUBMIT_BUTTON.click();
        sleep(1000);

    }

    static public void logout() {
        ACCOUNT_BUTTON.click();
        sleep(2000);
        ACCOUNT_BUTTON_LOGOUT.click();
        ACCOUNT_BUTTON_LOGOUT_CONFIRM.click();
    }


}
