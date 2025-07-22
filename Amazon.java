import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/s?k=watch+for+woman&crid=33WNAR5JX8K99&sprefix=watch+for+woman%2Caps%2C316&ref=nb_sb_noss_1");
      /* List<WebElement> prices= driver.findElements(By.xpath("//span[@class='a-price']/span"));
       for(WebElement price:prices) {
    	   
    	   String priceText=price.getText().replace("$", "").replace(" ", "");
    	   int pricevalue=Integer.parseInt(priceText);
    	   System.out.println(pricevalue);
    	   
       }*/
	}

}
List<WebElement> titles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']//span[@class='a-offscreen']"));

for (int i = 0; i < titles.size(); i++) {
    String titleText = titles.get(i).getText();
    if (titleText.toLowerCase().contains("fossil")) {
        String priceText = prices.get(i).getText().replace("₹", "").replace(",", "").trim();
        System.out.println("Fossil Watch Found: " + titleText);
        System.out.println("Price: ₹" + priceText);
    }
}

