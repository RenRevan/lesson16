package testpkj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public WebDriver newDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ирен\\IdeaProjects\\l_SelDriver\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    @AfterClass
    public void closeDriver(){
        driver.close();
    }

    @DataProvider(name="data-for-tests")
    public Object[][] dataMethod(){
        return new Object[][]{
                {"data 1"},
                {"data 2"}};
    }
}
