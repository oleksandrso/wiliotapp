package androidTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.getWebDriverLogs;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TEST extends TestBase{

    @Test
    public  void home() {
        try {
            AndroidDriver driver = (AndroidDriver) getWebDriver();
            driver.pressKey(new KeyEvent(AndroidKey.HOME));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    @Test
    public  void homeTest2() {

        //((AndroidDriver) getWebDriver()).pressKey(new KeyEvent(AndroidKey.HOME));
        ((AndroidDriver) getWebDriver()).unlockDevice();


    }
}
