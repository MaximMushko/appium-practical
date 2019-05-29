package com.company.Tests;

import com.company.Capabilities.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TapsTest {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities.getCapabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//android.widget.TextView[@text='Views']")).click();

        WebElement expandedList = driver.findElement(By.xpath(".//android.widget.TextView[@text='Expandable Lists']"));

        TouchAction touchAction = new TouchAction(driver);

        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandedList))).perform();

        driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();

        WebElement peopleElement = driver.findElement(By.xpath(".//android.widget.TextView[@text='People Names']"));
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(peopleElement)).withDuration(Duration.ofSeconds(2))).release().perform();

        System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
    }


}
