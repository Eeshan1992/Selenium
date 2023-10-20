package automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksAndPrintingBrokenlinks {
	public static void main(String[] args) throws IOException {
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.flipkart.com/");
		List<WebElement> links = c1.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for(int i=0; i<countoflinks; i++)
		{
			WebElement a= links.get(i);
			String u1= a.getAttribute("href");
			System.out.println(u1);
			createconnectionofbrokenlinks(u1);
		}
	}
	static void createconnectionofbrokenlinks(String u1) throws IOException
	{
		URL url= new URL(u1);
		HttpURLConnection a1=(HttpURLConnection)url.openConnection();
		
		a1.connect();
		System.out.println(a1.getResponseCode());
		if(a1.getResponseCode()==200)
		{
			System.out.println(u1+"Link is valid");
		}
		else
		{
			System.out.println(u1+"Link is not valid");
		}
	
	}
}

