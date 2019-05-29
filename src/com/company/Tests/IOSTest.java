package com.company.Tests;

import com.company.Capabilities.IOSCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import sun.jvm.hotspot.utilities.Assert;

import java.net.MalformedURLException;
import java.util.HashMap;

public class IOSTest {

    public static void main(String[] args) throws MalformedURLException {
        IOSDriver <IOSElement> driver = IOSCapabilities.getCapability();

        driver.findElement(MobileBy.AccessibilityId("Alert Views")).click();
        driver.findElement(By.xpath("//*[@value='Text Entry']")).click();
        driver.findElement(By.className("XCUIElementTypeOther")).sendKeys("Hello World");
        driver.findElement(By.name("OK")).click();
        driver.navigate().back();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String elementID = driver.findElement(MobileBy.AccessibilityId("Steppers")).getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
        scrollObject.put("toVisible", "not an empty string");
        js.executeScript("mobile:scroll", scrollObject);

        driver.findElement(MobileBy.AccessibilityId("Steppers")).click();

        for(int i=0; i<10; i++){
            driver.findElement(By.name("Increment")).click();

            int result = Integer.parseInt(driver.findElement(By.xpath("//XCUIElementTypeStaticText[1]")).getText());

            Assert.that(result == i+1, "It's very bad");
        }
    }

}
