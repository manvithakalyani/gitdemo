import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.switchTo().frame(0);
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes: " + allFrames.size());
		for (WebElement frame : allFrames) {
		    System.out.println("Frame ID/Name: " + frame.getAttribute("id"));
		}
		driver.switchTo().defaultContent();

		driver.switchTo().frame("iframeResult");
		
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement box : checkbox) {
		
			String value = box.getAttribute("value");
			System.out.println(" value " +value);
			if (value.equalsIgnoreCase("Bike") || value.equalsIgnoreCase("Boat")) {
		        box.click();
		    }
			
	}

	}

}
