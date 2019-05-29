package com.company.Capabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSCapabilities {

    public static IOSDriver<IOSElement> getCapability() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(MobileCapabilityType.UDID, "30F4E6C9-E319-40E2-9AEC-60E5C2916F29");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/mmushko/Desktop/UICatalog.app");

        IOSDriver<IOSElement> iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return iosDriver;
    }
}
