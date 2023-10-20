package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
    @DataProvider(name="country")
   public Object testdata()
   {
	   return new Object[][] {{"India"},{"SriLanka"},{"Nepal"},{"Bhutan"}};
   }
   @Test(dataProvider="country")
   public void testcase1(String names) throws InterruptedException
   {
	   System.out.println(names);
	   ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		c1.findElement(By.name("q")).sendKeys(names);
		c1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		c1.quit();
   }



}