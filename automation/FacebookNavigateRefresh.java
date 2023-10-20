package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNavigateRefresh {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007799%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIsKGc5ZDJ_gIVtlZ9Ch1zHAMcEAAYASAAEgJ4EPD_BwE");
		c1.manage().window().maximize(); 
		WebElement firstname = c1.findElement(By.name("firstname"));
	    firstname.sendKeys("Eeshan");
	    Thread.sleep(3000);   
	    WebElement surname = c1.findElement(By.name("lastname")); 
	    surname.sendKeys("Acharya");
	    Thread.sleep(3000);   
	    WebElement mobemail = c1.findElement(By.name("reg_email__")); 
	   mobemail.sendKeys("eeshanacharya@yahoo.co.in");
	   Thread.sleep(3000); 
	   WebElement reenter = c1.findElement(By.name("reg_email_confirmation__"));
	   reenter.sendKeys("eeshanacharya@yahoo.co.in");
	   Thread.sleep(3000);
	    WebElement newpassword = c1.findElement(By.name("reg_passwd__")); 
	   newpassword.sendKeys("eheheheh");
	 WebElement birthday = c1.findElement(By.name("birthday_day"));
	 Select c2 = new Select(birthday);
	 c2.selectByValue("28");
	 WebElement month= c1.findElement(By.name("birthday_month"));
	 Select c3 = new Select(month);
	 c3.selectByValue("11");
	 WebElement year = c1.findElement(By.name("birthday_year"));
	 Select c4 = new Select(year);
	 c4.selectByValue("1992");
	 Thread.sleep(3000);
	 WebElement gender = c1.findElement(By.xpath("//label[.=\"Male\"]"));
	 gender.click();
	 Thread.sleep(3000);
	   c1.navigate().refresh(); 
	 
	}

}
