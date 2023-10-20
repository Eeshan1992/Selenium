package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NetFlix {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='a7b415e6cc3af']"));
	            dropdown.click();
	   Select s1= new Select(dropdown);
		
	  s1.selectByVisibleText("English");
	}

}
