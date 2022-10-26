package iOS.pageObgects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final SelenideElement LOGIN_FIELD(){
        return $(AppiumBy.iOSNsPredicateString("value =='Email'"));
    }
    public static final SelenideElement PASSWORD_FIELD(){
        return $(AppiumBy.iOSNsPredicateString("value =='Password'"));
    }
    public static final SelenideElement SUBMIT_BUTTON(){
        return $(AppiumBy.iOSNsPredicateString("label == 'Submit'"));
    }
    public static final SelenideElement FORGOT_PASSWORD_BUTTON(){
        return $(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Forgot your password?'`]"));
    }

}
