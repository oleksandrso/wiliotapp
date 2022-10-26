package iOS.pageObgects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class GeneralAppItems {
    public static final SelenideElement ACCOUNT_BUTTON(){
        return $(AppiumBy.iOSNsPredicateString("label == 'UserAccount'"));
    }
}
