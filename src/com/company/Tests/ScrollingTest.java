package com.company.Tests;

import com.company.Capabilities.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class ScrollingTest {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities.getCapabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//android.widget.TextView[@text='Views']")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ScrollBars\"));"));

    }
}
