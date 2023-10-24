import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class BaseTest {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @BeforeEach
    public void openMainPage() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @AfterAll
    public static void finishTesting() {
        driver.close();
        driver.quit();
    }
}
