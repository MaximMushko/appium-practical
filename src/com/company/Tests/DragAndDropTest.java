package com.company.Tests;


import com.company.Capabilities.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = Capabilities.getCapabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//android.widget.TextView[@text='Views']")).click();

        driver.findElement(By.xpath(".//android.widget.TextView[@text='Drag and Drop']")).click();

        WebElement source = (WebElement) driver.findElements(By.xpath(".//android.view.View")).get(0);
        WebElement destination = (WebElement) driver.findElements(By.xpath(".//android.view.View")).get(1);

        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(
                LongPressOptions.longPressOptions()
                        .withElement(element(source)))
                .moveTo(element(destination))
                .release()
                .perform();


    }
}
