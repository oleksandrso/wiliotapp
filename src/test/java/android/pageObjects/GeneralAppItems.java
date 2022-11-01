package android.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class GeneralAppItems {
    public static final SelenideElement
            ACCOUNT_BUTTON = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]")),
            CONNECT_BUTTON = $(AppiumBy.className("android.view.View")).$(AppiumBy.xpath("//android.widget.Button[2]")),
            USER_FROM_LIST = $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]")),
            ASSETS_MENU_BUTTON = $(AppiumBy.xpath("//android.widget.TextView[@text='Assets']")),
            EDGE_MENU_BUTTON = $(AppiumBy.xpath("//android.widget.TextView[@text='Edge']")),
            HOME_MENU_BUTTON = $(AppiumBy.xpath("//android.widget.TextView[@text='Home']")),
            PERMISSION_DIALOG_OK = $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));

}
