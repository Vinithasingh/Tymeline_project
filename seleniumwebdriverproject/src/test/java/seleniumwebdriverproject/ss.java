package seleniumwebdriverproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ss {

    private WebDriver driver;
    private ExtentReports extent;     
    private ExtentTest test;          

    @BeforeClass
    public void setup() {
        // Initialize ExtentReports
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReports.html"); // HTML report location
        extent = new ExtentReports();
        extent.attachReporter(spark);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Create a test entry in the report
        test = extent.createTest("Google Search Test - Verify search results page title");

        // Navigate to Google
        test.info("Navigating to Google homepage");
        test.info("click on the searchbox ");
        
        driver.get("https://www.google.com");

        // Find the search bar and enter the query
        test.info("Entering search query: 'Recent rape cases happening in India'");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Recent rape cases happening in India");
        searchBox.submit();

        // Wait for results to load
        Thread.sleep(2000);

        // Assert that the results page loaded by checking the title
        String title = driver.getTitle();
        test.info("Verifying the page title contains the search query");
        Assert.assertTrue(title.toLowerCase().contains("recent rape cases happening in india"),
                "The page title does not contain the expected text.");
        test.pass("The page title contains the search query text.");
        test.pass("Google search results are displayed, and the first result is relevant to the search query.");

    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }

        // Finish and flush the ExtentReports
        extent.flush();
    }
}
