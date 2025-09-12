
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;

import java.net.URL;

public class TestOnNode2 {
    WebDriver driver;

    @Parameters({"hubURL","browser","nodePort"})
    @BeforeTest
    public void setup(String hubURL, String browser, String nodePort) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);
        caps.setCapability("se:name", "Test on Node2");

        driver = new RemoteWebDriver(new URL(hubURL), caps);
    }

    @Test
    public void runTest2() {
        driver.get("https://www.bing.com");
        System.out.println("Title on Node2: " + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
