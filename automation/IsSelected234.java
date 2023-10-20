package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected234 {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		 c1.get("https://grotechminds.com/is-selected/");
		 WebElement a= c1.findElement(By.id("vehicle2"));
		 boolean boy = a.isSelected();
		 System.out.println(boy);
		if(a.isSelected()==false)
		{
			 
			 a.click();
		}

	}

}
