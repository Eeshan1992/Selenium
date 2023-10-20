package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		c1.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = c1.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
      int noofautosuggestion =  autosuggestion.size();
     System.out.println(noofautosuggestion);
     Thread.sleep(6000);
    // autosuggestion.get(noofautosuggestion-1).click();
     //  autosuggestion.get(noofautosuggestion-5).click();
    autosuggestion.get(5).click();
	}

}
