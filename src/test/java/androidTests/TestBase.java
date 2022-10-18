package androidTests;

import com.codeborne.selenide.Screenshots;
import drivers.AndroidMobileDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static androidTests.CommonActions.installApp;
import static androidTests.CommonActions.removeApp;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TestBase{
    @BeforeAll
    public static void setup() {
        browser = AndroidMobileDriver.class.getName();
        timeout = 5000;
        browserSize = null;
        open();
        installApp();
    }

    @AfterAll
    static void afterAll() {
        removeApp();
        closeWebDriver();
    }

    @BeforeEach
    public void startDriver() {
    }

    @AfterEach
    public void afterEach() {
        screenshot("lastScreenshot");
    }
}
