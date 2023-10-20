package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		Thread.sleep(4000);
		c1.navigate().to("https://www.google.com");
		Thread.sleep(4000);
        c1.navigate().back();
        Thread.sleep(4000);
        c1.navigate().forward();
        Thread.sleep(4000);
        c1.navigate().refresh();
	}

}
