package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Metallica {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://grotechminds.com/automate-me/");
	    WebElement hover = c1.findElement(By.xpath("(//div[@style='background-color: #f2f6fb;'])[1]"));
         Actions a1 = new Actions(c1);
         a1.moveToElement(hover).perform();
	    WebElement read = c1.findElement(By.xpath("(//a[.=\"Read More\"])[1]"));
	     read.click();
	     c1.get("https://www.solidworks.com/");
	     c1.findElement(By.id("footer_tc_privacy_button_3")).click();
	     WebElement hover2 = c1.findElement(By.xpath("//h2[.=\"Design Data Made Easy\"]"));
	     Actions a2 = new Actions(c1);
	     a2.moveToElement(hover2).perform();
	     WebElement open = c1.findElement(By.xpath("//a[@href=\"/lp/modernize-your-product-development-process\"]"));
	     open.click();
	}

}
