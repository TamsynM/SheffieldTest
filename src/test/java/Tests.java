import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
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
        String URL = driver.getCurrentUrl();
        Utils.captureScreenshot(driver,"Login Failure");
        Assert.assertEquals(URL, "https://www.sheffield.ac.uk/myaccount", "Login page is not displayed");
    }

    @AfterMethod
    public static void teardown() {
        driver.quit();
    }
}
