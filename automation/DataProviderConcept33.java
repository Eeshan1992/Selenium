package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept33 {
	  @DataProvider(name="Std_details")
	  public Object testdata()
	  {
		  Object data[][]= new Object[2][2];
		  data[0][0]="Ram";
		  data[0][1]="51";
		  data[1][0]="Sita";
		  data[1][1]="39";
		  return data;
	  }
	  @Test(dataProvider="Std_details")
	   public void testcase1(String username,String password) 
	   {
		  ChromeDriver c1= new ChromeDriver();
		  c1.get("https://www.facebook.com/login/");
		  c1.manage().window().maximize();
		  c1.findElement(By.name("email")).sendKeys(username);
		  c1.findElement(By.name("pass")).sendKeys(password);
		  c1.findElement(By.name("login")).click();
	   }

}

