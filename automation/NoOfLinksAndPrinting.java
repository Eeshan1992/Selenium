package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksAndPrinting {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		List<WebElement> links = c1.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for(int i=0; i<countoflinks; i++)
		{
			WebElement a= links.get(i);
			String linktextvalue= a.getText();
			System.out.println(linktextvalue);
		}
	}

}
