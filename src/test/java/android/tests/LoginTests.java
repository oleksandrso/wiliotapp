package android.tests;

import android.testConfig.AndroidTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static android.AndroidCommonActions.*;
import static android.pageObjects.AssetsPage.ASSETS_PAGE;
import static android.pageObjects.EdgePage.EDGE_PAGE;
import static android.pageObjects.GeneralAppItems.USER_FROM_LIST;
import static android.pageObjects.GeneralAppItems.*;
import static android.pageObjects.HomePage.HOME_PAGE;
import static android.pageObjects.LoginPage.LOGIN_FIELD;
import static android.pageObjects.TestData.LOGIN;
import static android.pageObjects.TestData.PASSWORD;
import static com.codeborne.selenide.Condition.visible;

public class LoginTests extends AndroidTestBase {


    @Test
    @DisplayName("Login Test")
    public void positiveFirstTimeLoginTest() {
        //open app and try SignIn
        openWiliotApp();
        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);
        //Check result
        USER_FROM_LIST.click();
        HOME_PAGE.shouldBe(visible);
//        //logout
//        logout();
    }

    @Test
    @DisplayName("Login Test")
    public void assetsPageOpensAfterClick() {
        ASSETS_MENU_BUTTON.click();
        ASSETS_PAGE.shouldBe(visible);
    }

    @Test
    @DisplayName("Login Test")
    public void edgePageOpensAfterClick() {
        EDGE_MENU_BUTTON.click();
        EDGE_PAGE.shouldBe(visible);
    }

    @Test
    @DisplayName("Login Test")
    public void homePageOpensAfterClick() {
        HOME_MENU_BUTTON.click();
        HOME_PAGE.shouldBe(visible);
    }
    @Test
    @DisplayName("Login Test")
    public void connectButton() {
        CONNECT_BUTTON.click();
        if(PERMISSION_DIALOG_OK.isDisplayed()){
            PERMISSION_DIALOG_OK.click();
        }

        HOME_PAGE.shouldBe(visible);
    }

    @Test
    @DisplayName("Logout Test")
    public void logoutTest() {
        //open app and try SignIn
        openWiliotApp();
        //Send Login And Password (in test configuration should be added credentials)
        login(LOGIN, PASSWORD);
        //Check result
        USER_FROM_LIST.click();
        //logout
        logout();
        //check logout on chrome
        LOGIN_FIELD.shouldBe(visible);//-?
    }
}
