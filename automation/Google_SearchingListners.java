package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnersTopic.class)
public class Google_SearchingListners {
 @Test
 public void testcase()
 {
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("q")).sendKeys("India");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
 }
}
