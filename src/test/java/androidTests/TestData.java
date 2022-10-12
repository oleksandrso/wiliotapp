package androidTests;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestData {
   public static String LOGIN="autotest@wiliot.com", PASSWORD="!Qxys83=!NaPEOF-QLM]";
   public static final SelenideElement LOGIN_FIELD = $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText"));
   public static final SelenideElement PASSWORD_FIELD = $(MobileBy.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
   public static final SelenideElement SUBMIT_BUTTON = $(MobileBy.cssSelector("android.widget.Button"));
   public static final SelenideElement USER_FROM_LIST = $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]"));
   public static final SelenideElement ACCOUNT_BUTTON = $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]"));
   public static final SelenideElement ACCOUNT_BUTTON_LOGOUT = $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button"));
   public static final SelenideElement ACCOUNT_BUTTON_LOGOUT_CONFIRM = $(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
   public static final SelenideElement CHROME= $(MobileBy.accessibilityId("Chrome"));
   public static final SelenideElement DEVICE_HOME_SCREEN= $(MobileBy.xpath("//android.view.View[@content-desc='Home']"));
   public static final SelenideElement WILIOT_APP_ICON= $(MobileBy.accessibilityId("Wiliot App"));



}
