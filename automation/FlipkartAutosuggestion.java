package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.flipkart.com");
		 c1.manage().window().maximize();
	WebElement flipcart= c1.findElement(By.xpath("//span[.='✕']"));
   flipcart.click();
   c1.findElement(By.name("q")).sendKeys("shoes");
	Thread.sleep(2000);
	List<WebElement> autosuggestion = c1.findElements(By.xpath("//form[@class='_2SmNnR\']/ul/li"));
	 int noofautosuggestion =  autosuggestion.size();
     System.out.println(noofautosuggestion);
     Thread.sleep(6000);
     autosuggestion.get(noofautosuggestion).click();
    // autosuggestion.get(noofautosuggestion-3).click();
	}
	

}
