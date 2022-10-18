package androidTests;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class TestData {
    public static final String APP_PACKAGE="com.wiliot.wiliotapp";
    public static final SelenideElement LOGIN_FIELD = $(AppiumBy.xpath("//*[@resource-id='loginId']")); //clean ID not working
    public static final SelenideElement PASSWORD_FIELD = $(AppiumBy.xpath("//*[@resource-id='password']")); //clean ID not working
    public static final SelenideElement SUBMIT_BUTTON = $(AppiumBy.xpath("//android.widget.Button[@text='Submit']"));
    public static final SelenideElement USER_FROM_LIST = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]"));
    public static final SelenideElement ACCOUNT_BUTTON = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]"));
    public static final SelenideElement ACCOUNT_BUTTON_LOGOUT = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button"));
    public static final SelenideElement ACCOUNT_BUTTON_LOGOUT_CONFIRM = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
    public static String LOGIN = "autotest@wiliot.com", PASSWORD = "!Qxys83=!NaPEOF-QLM]";


}
