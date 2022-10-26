package iOS.pageObgects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AccountAppSettingsMenu {
    public static final SelenideElement LOGOUT_BUTTON(){
        return $(AppiumBy.iOSClassChain("**/XCUIElementTypeCell[`label == 'Logout'`]/XCUIElementTypeOther[2]/XCUIElementTypeOther"));
    }


}
