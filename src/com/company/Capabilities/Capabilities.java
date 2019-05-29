package com.company.Capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {

    public static AndroidDriver<AndroidElement> getCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 26");
        //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("appPackage", "ru.yandex.music");
        capabilities.setCapability("appActivity", "ru.yandex.music.main.MainScreenActivity");

        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        return androidDriver;
    }
}
