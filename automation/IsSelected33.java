package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected33 {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		 c1.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		 WebElement a= c1.findElement(By.id("123"));
		 a.isSelected();
		 System.out.println(a.isSelected());
		 if(a.isSelected()==false)
			{
				 
				 a.click();
			}
	}

}
