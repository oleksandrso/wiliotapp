package androidTests;

import driver.LocalDeviceDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeAll
    public static void setup(){
        browser=LocalDeviceDriver.class.getName();
        timeout=5000;
        browserSize=null;
    }
    @BeforeEach
    public void beforeEach(){
        open();
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}
