package ShopPageTest.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    private String baseUrl = "http://automationpractice.com/index.php";

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\e\\OneDrive\\Desktop\\chromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.getLogLevel();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.getCurrentUrl();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
