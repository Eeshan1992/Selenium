package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		ChromeDriver a1= new ChromeDriver();
		a1.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=4016027554843950762&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007799&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		a1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	    a1.findElement(By.xpath("//input[@id=\'nav-search-submit-button']")).click();
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click(); 
		      
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[8]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[9]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[10]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[11]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[12]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[13]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[14]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[15]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[16]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[17]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[18]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[19]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[20]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[21]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[22]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[23]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[24]")).click(); 
	    a1.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[25]")).click(); 
	}

}
