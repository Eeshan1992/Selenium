package automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver g1= new ChromeDriver();
         g1.get("http://www.amazon.in");
         g1.manage().window().maximize();
         g1.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
         Thread.sleep(3000);
   List<WebElement> auto= g1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count =    auto.size();
	System.out.println(count);
	//auto.get(count-10).click();
	auto.get(count-1).click();
	
	}

}
