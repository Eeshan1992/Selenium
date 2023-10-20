package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownKeyFunctionality {
	public static void main(String[] args) throws InterruptedException    {
		ChromeDriver c1= new ChromeDriver();
        c1.get("https://grotechminds.com/registration/");
	    c1.manage().window().maximize(); 
	  Thread.sleep(3000);
	WebElement dd=  c1.findElement(By.xpath("(//span[.='—Please choose an option—'])[3]"));
	dd.sendKeys(Keys.ENTER+"+"+Keys.ARROW_DOWN+"+"+Keys.ARROW_DOWN+"+"+Keys.ARROW_DOWN+"+"+Keys.ARROW_DOWN);
}
}