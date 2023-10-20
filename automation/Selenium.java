package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) {
		ChromeDriver s1 = new ChromeDriver();
        s1.get("https://www.worldleadershipacademy.live/");
        s1.manage().window().maximize();
        WebElement q1 = s1.findElement(By.xpath("//a[.='Publications']"));
         Actions a1= new Actions(s1);
         a1.moveToElement(q1).perform();
         WebElement q2 = s1.findElement(By.xpath("(//a[.='Books'])[1]"));
         a1.moveToElement(q2).perform();
         WebElement q3 = s1.findElement(By.xpath("//a[.='Publish With Us']"));
	     q3.click();
	}
	

}
