package com.test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().driverVersion("124").setup();

        // Setup WebDriverManager to manage the ChromeDriver binary
        WebDriverManager.chromedriver().setup();
        
        // Initialize the ChromeDriver
        WebDriver webDriver = new ChromeDriver();
        
        // Open a webpage (Google, for example)
        webDriver.get("https://github.com/Khushi-tech/AutomationTestingDemo/blob/main/src/module-info.java");

        // Optional: Maximize the window
        webDriver.manage().window().maximize();

        // Perform any actions you need here...

        // Close the browser after a delay (for demonstration purposes)
        try {
            Thread.sleep(3000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            webDriver.quit();
        }
    }
}