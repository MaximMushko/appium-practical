package com.company.Tests;

import com.company.Capabilities.IOSSafaryCapability;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class IOSSafariTest {
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver <IOSElement> driver = IOSSafaryCapability.getCapabilyties();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Navigating to Udemy");

        driver.get("https://udemy.com");

        System.out.println("Succesfully navigated to Udemy");

       // driver.findElement(By.xpath(".//*[@id='ios-splash']/a")).click();

        driver.findElement(By.xpath("//*[contains(@placeholder, 'What do you want to learn?')]")).sendKeys("SoapUI");

        driver.findElement(By.xpath("//button[@data-purpose='home-search-button']")).click();

        System.out.println(driver.findElement(By.xpath(".//div[@data-purpose='search-course-cards'][1]")).getText());


    }
}
