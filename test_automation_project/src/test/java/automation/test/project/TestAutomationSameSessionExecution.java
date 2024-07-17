package automation.test.project;

//import org.junit.*;
import automation.test.project.pageObject.GooglePage;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test; ez nem kell, mert az előző sorban a * az összes verzióját hozzáadja
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestAutomationSameSessionExecution {

    private static WebDriver driver;

    /*@BeforeAll
    public static void setupWebDriverChromeDriver() {
        System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromeDriver/chromedriver.exe");
    }*/

    GooglePage googlePage = new GooglePage(driver);

    @BeforeAll
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));
        googlePage.clickGoogleCookieAccept();
        googlePage.clickGoogleTextBox();
        googlePage.fillGoogleTextBox("Selenium");
        googlePage.clickGoogleSearchButton();
        WebElement seleniumClick = driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/']/h3"));
        seleniumClick.click();
        WebElement seleniumIde = driver.findElement(By.xpath("//a[contains(@class,'selenium-ide')]"));
        new Actions(driver)
                .scrollToElement(seleniumIde)
                .perform();
        seleniumIde.click();

    }

    /*@Test
    public void verifyGitHubTitle() {
        driver.get("https://www.github.com");
        assertTrue(driver.getTitle().contains("GitHub"));
    }*/



}