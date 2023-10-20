package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabKey {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
        c1.get("https://grotechminds.com/registration/");
	    c1.manage().window().maximize(); 
	 WebElement un=   c1.findElement(By.id("1"));
	 un.sendKeys("Selenium");
	  un.sendKeys(Keys.CONTROL+"a");
	  un.sendKeys(Keys.CONTROL+"c");
	  un.sendKeys(Keys.TAB);
	   WebElement hint =   c1.findElement(By.id("2"));
	   hint.sendKeys(Keys.CONTROL+"v");
	  hint.sendKeys(Keys.TAB);
	  WebElement pass =   c1.findElement(By.id("3"));
	  pass.sendKeys(Keys.CONTROL+"v");
	  pass.sendKeys(Keys.TAB);
	  WebElement yfn =   c1.findElement(By.id("4"));
			yfn.sendKeys(Keys.CONTROL+"v");
			yfn.sendKeys(Keys.TAB);
			  WebElement yln =   c1.findElement(By.id("5"));
				 yln.sendKeys(Keys.CONTROL+"v");
				 yln.sendKeys(Keys.TAB);
	
	}

}
