package com.company.Tests;

import com.company.Capabilities.HybridAppCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HybridAppTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = HybridAppCapabilities.getCapabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getContext());


        driver.findElement(By.id("com.snc.test.webview2:id/action_go_website")).click();

        driver.findElement(By.id("com.snc.test.webview2:id/input_url")).sendKeys("www.google.com");

        driver.findElement(By.xpath("//*[@text='GO']")).click();

        Set<String> contexts = driver.getContextHandles();

        for(String context: contexts){
            System.out.println(context);
        }

        driver.context("WEBVIEW_com.snc.test.webview2");

//To enable WebView debugging, call the static method setWebContentsDebuggingEnabled on the WebView class.
        driver.findElement(By.name("q")).sendKeys("Handling hybrid app");

        driver.context("NATIVE_APP");
    }
}
