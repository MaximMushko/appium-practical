package com.company;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeCapabilities {
    public static AndroidDriver<AndroidElement> getCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        return androidDriver;
    }
}
