
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brokenlink {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        // Point to your Selenium Grid Standalone
        URL gridUrl = new URL("http://192.168.31.198:4444/wd/hub");  // <--- your grid
        ChromeOptions options = new ChromeOptions();
        
        WebDriver driver = new RemoteWebDriver(gridUrl, options);

        driver.get("https://demoqa.com/broken");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        Set<String> uniqueUrls = new HashSet<>();
        int brokenCount = 0;

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("Empty URL skipped");
                continue;
            }
            if (!uniqueUrls.add(url)) {
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int responseCode = conn.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " is broken. Code: " + responseCode);
                    brokenCount++;
                } else {
                    System.out.println(url + " is valid.");
                }

            } catch (Exception e) {
                System.out.println(url + " is broken. Exception: " + e.getMessage());
                brokenCount++;
            }
        }

        System.out.println("Total broken links found: " + brokenCount);
        driver.quit();
    }
}
