package org.HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.airbnb.com.ua/ukraine/stays");

        String text = driver.findElement(By.xpath("//label[@for='query']")).getText();
        System.out.println(text);

        boolean isDisplayed = driver.findElement(By.xpath("//img[@loading='eager']")).isDisplayed();
        System.out.println(isDisplayed);

        driver.findElement(By.xpath("//div[@class=' dir dir-ltr']//a[@href='/ukraine/stays/cottages']")).click();

        WebElement inputElement = driver.findElement(By.xpath("//input[@name='query']"));
        inputElement.clear();
        inputElement.sendKeys("Kharkiv");

    }
}
