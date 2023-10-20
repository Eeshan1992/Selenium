package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Joga {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.flipkart.com");
		 c1.manage().window().maximize();
	WebElement flipcart= c1.findElement(By.xpath("//button[.='✕']"));
    flipcart.click();
    WebElement fashion = c1.findElement(By.xpath("(//div[.='Fashion'])[4]"));
    Actions a1 = new Actions(c1);
    a1.moveToElement(fashion).perform();
    c1.findElement(By.linkText("Women Ethnic")).click();
    
    

	}

}
