package com.company;

import com.sun.tools.corba.se.idl.constExpr.And;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;


public class Main {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
// write your code here
        AndroidDriver driver = Capabilities.getCapabilities();

        driver.findElement(By.xpath(".//android.widget.TextView[@text='Preference']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath(".//android.widget.TextView[@text='3. Preference dependencies']")).click();

        driver.findElement(By.id("android:id/checkbox")).click();

        driver.findElement(By.xpath("(.//android.widget.RelativeLayout)[2]")).click();

        AndroidElement input = (AndroidElement) driver.findElement(By.className("android.widget.EditText"));

        input.setValue("Hello");
        driver.hideKeyboard();

        List<AndroidElement> buttons = driver.findElements(By.className("android.widget.Button"));
        buttons.get(1).click();
    }
}