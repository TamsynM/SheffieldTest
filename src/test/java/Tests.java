import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class Tests {
    private static WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
    }

    @Test(testName = "Assert Copyright")
    public static void assertCopyright() {
        final String FOOTER_COPYRIGHT_TEXT = "© 2021 The University of Sheffield";
        driver.get(Utils.BASE_URL);
        HomePage homepage = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Assert.assertEquals(homepage.readFooterCopyrightText(), FOOTER_COPYRIGHT_TEXT);
    }

    @Test(testName = "Login Failure")
    public static void loginFailure() {
        driver.get(Utils.BASE_URL);
        HomePage homepage = new HomePage(driver);
        homepage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }

    @AfterMethod
    public static void teardown() {
        driver.quit();
    }
}
