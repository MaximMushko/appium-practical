package com.company.Tests;

import com.company.Capabilities.IOSSafaryCapability;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class IOSSafariTest {
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver <IOSElement> driver = IOSSafaryCapability.getCapabilyties();

        driver.get("http://www.google.com");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello i am Maksim");
    }
}
