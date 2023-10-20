package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
         c1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     c1.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	
	}

}
