package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		 c1.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		WebElement a= c1.findElement(By.id("1"));
		boolean ans= a.isDisplayed();
        System.out.println(ans);
        if(a.isDisplayed()==true)
        {
          a.sendKeys("eeshan");
        }
	}

}
