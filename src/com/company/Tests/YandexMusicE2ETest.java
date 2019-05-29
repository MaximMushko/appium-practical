package com.company.Tests;

import com.company.Capabilities.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import sun.jvm.hotspot.utilities.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class YandexMusicE2ETest {
    public static void main(String[] args) throws MalformedURLException {

        String expectedSong = "Winter Has Come";
        AndroidDriver androidDriver = Capabilities.getCapabilities();

        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        androidDriver.findElement(By.xpath(".//android.widget.Button[@text='Continue']")).click();

        androidDriver.findElement(By.xpath(".//android.widget.Button[@text='Log in']")).click();

        androidDriver.findElement(By.xpath(".//android.widget.Button[@text='Sign in']")).click();

        androidDriver.findElement(By.id("ru.yandex.music:id/mymusic")).click();

        androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Мой плейлист\"));")).click();

        androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+expectedSong+"\"));")).click();

        String songName = androidDriver.findElement(By.className("android.widget.LinearLayout")).findElement(By.id("ru.yandex.music:id/track_name")).getText();

        Assert.that(songName.equals(expectedSong), "Baddd");
    }
}
