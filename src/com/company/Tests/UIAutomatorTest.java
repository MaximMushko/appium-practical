package com.company.Tests;

import com.company.Capabilities.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.List;

public class UIAutomatorTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver = Capabilities.getCapabilities();

        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
        //driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        List<AndroidElement> buttons = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)"));

        System.out.println(buttons.size());

    }
}
