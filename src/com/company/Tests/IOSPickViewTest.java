package com.company.Tests;

import com.company.Capabilities.IOSCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class IOSPickViewTest {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver <IOSElement> driver = IOSCapabilities.getCapability();

        driver.findElement(MobileBy.AccessibilityId("Picker View")).click();

        driver.findElements(By.className("XCUIElementTypePickerWheel")).get(0).sendKeys("35");
        driver.findElement(MobileBy.AccessibilityId("Green color component value")).sendKeys("250");
        driver.findElement(By.xpath("//*[@name='Blue color component value']")).sendKeys("130");
    }
}
