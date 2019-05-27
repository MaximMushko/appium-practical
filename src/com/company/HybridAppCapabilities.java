package com.company;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HybridAppCapabilities {

    public static AndroidDriver getCapabilities () throws MalformedURLException {
        File appDir = new File("src");

        File app = new File(appDir, "testApp.apk");

        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        AndroidDriver androidDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );

        return androidDriver;
    }
}
