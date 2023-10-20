package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkWithoutClick {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
	       c1.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
	  WebElement link =  c1.findElement(By.tagName("a"));
	  link.sendKeys(Keys.ENTER);
	}

}
