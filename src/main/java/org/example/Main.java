package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");
        System.out.println("Google was opened");
    }
}