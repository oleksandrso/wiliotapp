package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestData {
    public static final String APP_PACKAGE="com.wiliot.wiliotapp";
    public static final SelenideElement USER_FROM_LIST = $(AppiumBy.className("android.widget.ScrollView")).$$(AppiumBy.className("android.view.View")).get(1);
    public static String LOGIN = "autotest_new@wiliot.com", PASSWORD = "L6V@h&rVuc%8z:E$RqNJ";

}
