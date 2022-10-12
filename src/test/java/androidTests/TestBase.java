package androidTests;

import drivers.AndroidMobileDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeAll
    public static void setup(){
        browser=AndroidMobileDriver.class.getName();
        timeout=5000;
        browserSize=null;
    }
    @BeforeEach
    public void startDriver(){
        open();
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}
