package automation.test.project;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;

public class TestAutomationNewSessionExecution {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void verifyGitHubTitle() {
        driver.get("https://www.google.com");
        Assertions.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    public void verifyGitHubTitle2() {
        driver.get("https://www.github.com");
        Assertions.assertTrue(driver.getTitle().contains("GitHub"));
    }

}