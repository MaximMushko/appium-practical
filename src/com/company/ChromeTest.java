package com.company;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import sun.jvm.hotspot.utilities.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ChromeTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver androidDriver = ChromeCapabilities.getCapabilities();

        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.get("https://www.cricbuzz.com/");

        androidDriver.findElement(By.xpath("//a[@href='#menu']")).click();
        androidDriver.findElement(By.xpath("//a[@title='Cricbuzz Home']")).click();

        System.out.println(androidDriver.getCurrentUrl());

        JavascriptExecutor jse = (JavascriptExecutor) androidDriver;

        WebElement header = androidDriver.findElement(By.xpath("//h4[text()='Top Stories']"));

        jse.executeScript("arguments[0].scrollIntoView()", header);

        Assert.that(header.getAttribute("class").contains("header"), "Ololo");
    }
}
