package seleniumwebdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchBoxFunctionality {

    private WebDriver driver; 

    @BeforeClass
    public void setup() {
        
        // Initialize WebDriver and navigate to the desired page
       driver = new ChromeDriver();
        driver.manage().window().maximize(); 
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search bar and enter query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Recent rape cases happening in India");
        searchBox.submit(); 

        // Wait for the results to load
        Thread.sleep(2000);

        // Assert that the results page loaded by checking the title
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.toLowerCase().contains("recent rape cases happening in india"),
                "The page title does not contain the expected text.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test is completed
        if (driver != null) {
            driver.quit();
        }
    }
}









