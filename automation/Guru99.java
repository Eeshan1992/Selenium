package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.demo.guru99.com/V4/");
		c1.findElement(By.name("uid")).sendKeys("eeshan");
		c1.findElement(By.name("password")).sendKeys("ssss");
		c1.findElement(By.name("btnLogin")).click();
	
	}   
}
