package automation.test.project.stepDefs;


import automation.test.project.pageObject.GooglePage;
import automation.test.project.pageObject.SeleniumPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicNavigationPageSteps {
    private static WebDriver driver;
    GooglePage googlePage = new GooglePage(driver);
    SeleniumPage seleniumPage = new SeleniumPage(driver);

    public String googlePageUrl = "https://www.google.com";

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
    public void navigateToSeleniumIde() {
        driver.get(googlePageUrl);
        assertTrue(driver.getTitle().contains("Google"));
        googlePage.clickGoogleCookieAccept();
        googlePage.clickGoogleTextBox();
        googlePage.fillGoogleTextBox("Selenium");
        googlePage.clickGoogleSearchButton();
        seleniumPage.clickSeleniumClick();
        seleniumPage.scrollToSeleniumIde();
        seleniumPage.clickSeleniumIde();
    }

    @Test
    public void navigateToBrickset() {
        driver.get(googlePageUrl);
        assertTrue(driver.getTitle().contains("Google"));
        googlePage.clickGoogleCookieAccept();
        //googlePage.clickGoogleTextBox();
        googlePage.fillGoogleTextBox("Brickset");
        googlePage.clickGoogleSearchButton();
    }
}
