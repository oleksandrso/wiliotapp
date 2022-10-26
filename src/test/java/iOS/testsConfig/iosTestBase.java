package iOS.testsConfig;

import iOS.testsConfig.iOSMobileDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class iosTestBase {
    @BeforeAll
    public static void setup() {
        browser = iOSMobileDriver.class.getName();
        timeout = 5000;
        browserSize = null;
        open();
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }


    @AfterEach
    public void afterEach() {
        screenshot("lastScreenshot");
    }
}
