package com.company.Tests;

import com.company.Capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class CommandsTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver androidDriver = Capabilities.getCapabilities();

        System.out.println(androidDriver.currentActivity());
        System.out.println(androidDriver.getContext());
        System.out.println(androidDriver.getOrientation());
        System.out.println(androidDriver.isDeviceLocked());
        System.out.println(androidDriver.isKeyboardShown());

        androidDriver.findElement(By.xpath(".//android.widget.TextView[@text='Views']")).click();

        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

}
