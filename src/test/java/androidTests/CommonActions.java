package androidTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static helpers.FileUtils.getAbsolutePath;

public class CommonActions extends TestData {
    private static final AndroidDriver androidDriver = (AndroidDriver) getWebDriver();


    public static void installApp() {
        if (!androidDriver.isAppInstalled(APP_PACKAGE)) {
            androidDriver.installApp(getAbsolutePath("src/test/resources/apk/wiliot.apk"));
        }
    }

    public static void removeApp() {
        if (androidDriver.isAppInstalled(APP_PACKAGE)) {
            androidDriver.removeApp(APP_PACKAGE);
        }
    }

    public static void home() {
        androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public static void clearChromeBrowser() {
        androidDriver.manage().deleteAllCookies();
    }

    public static void openWiliotApp() {
        androidDriver.activateApp(APP_PACKAGE);
        sleep(4000);
    }

    static public void login(String login, String password) {
        LOGIN_FIELD.sendKeys(login);
        PASSWORD_FIELD.sendKeys(password);
        SUBMIT_BUTTON.click();
        sleep(4000);

    }

    static public void logout() {
        ACCOUNT_BUTTON.click();
        sleep(2000);
        ACCOUNT_BUTTON_LOGOUT.click();
        ACCOUNT_BUTTON_LOGOUT_CONFIRM.click();
    }


}
