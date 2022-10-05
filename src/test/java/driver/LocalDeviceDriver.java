package driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LocalDeviceDriver implements WebDriverProvider {
    public static URL getDeviceUrl(){
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","Pixel_4_market");
//        desiredCapabilities.setCapability("deviceName","PJLZUSTGEQUSSSOR");
//        desiredCapabilities.setCapability("deviceName","P7RO8L85MBVW6XMJ");

        desiredCapabilities.setCapability("platformName","android");
        //desiredCapabilities.setCapability("appPackage","com.easternpeak.wiliot");


        return new AndroidDriver(getDeviceUrl(),desiredCapabilities);
    }
}
