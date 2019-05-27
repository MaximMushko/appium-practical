package com.company;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.Set;

public class HibridAppDemo {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = HybridAppCapabilities.getCapabilities();

        System.out.println(driver.getContext());

        Set<String> contexts = driver.getContextHandles();

        driver.findElement(By.id("com.example.testapp:id/urlField")).sendKeys("http://google.com");

        driver.findElement(By.id("com.example.testapp:id/goButton")).click();

        for(String context: contexts){
            System.out.println(context);
        }

        driver.context("WEBVIEW_com.example.testapp");

//To enable WebView debugging, call the static method setWebContentsDebuggingEnabled on the WebView class.
        driver.findElement(By.name("q")).sendKeys("Handling hybrid app");

        driver.context("NATIVE_APP");
    }
}
