package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public static final SelenideElement
            HOME_PAGE = $(AppiumBy.className("android.widget.ScrollView")).$(AppiumBy.xpath("//android.widget.TextView[@text='Welcome to the Wiliot deployment application']"));
}
