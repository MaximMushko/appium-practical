package com.company;

import com.sun.tools.corba.se.idl.constExpr.And;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Swipe {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities.getCapabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//android.widget.TextView[@text='Views']")).click();

        driver.findElement(By.xpath(".//android.widget.TextView[@text='Date Widgets']")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();
    }
}
