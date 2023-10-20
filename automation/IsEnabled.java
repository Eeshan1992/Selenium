package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		 c1.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		 WebElement a= c1.findElement(By.id("121"));
		 boolean yln= a.isEnabled();	       
		System.out.println(yln);
		 if(a.isEnabled()==false)
	        {
			 WebElement a1= c1.findElement(By.id("1"));
	          a1.sendKeys("eeshan");
	        }
	}

}
