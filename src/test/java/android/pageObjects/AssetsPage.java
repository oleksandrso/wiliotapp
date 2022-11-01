package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AssetsPage {
    public static final SelenideElement
            ASSETS_PAGE = $(AppiumBy.className("android.widget.ScrollView")).$(AppiumBy.xpath("//android.widget.TextView[@text='Assets']"));
}
