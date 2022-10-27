package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final SelenideElement LOGIN_FIELD = $(AppiumBy.xpath("//*[@resource-id='loginId']"));
    public static final SelenideElement PASSWORD_FIELD = $(AppiumBy.xpath("//*[@resource-id='password']"));
    public static final SelenideElement SUBMIT_BUTTON = $(AppiumBy.xpath("//android.widget.Button[@text='Submit']"));
}
