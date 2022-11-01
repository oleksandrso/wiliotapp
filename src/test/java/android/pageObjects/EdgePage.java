package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class EdgePage {
    public static final SelenideElement
            EDGE_PAGE = $(AppiumBy.className("android.widget.ScrollView")).$(AppiumBy.xpath("//android.widget.TextView[@text='Edge']"));

}
