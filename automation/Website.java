package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Website {

	public static void main(String[] args)throws ArithmeticException{
		int age=2;
		if(age>20)
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://grotechminds.com/");
		}
		else
		{
			throw new ArithmeticException("Age should be more than 20 "); 
		}
	}

}
