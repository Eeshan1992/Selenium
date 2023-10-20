package automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderConcept22 {
	  @DataProvider(name="Std_details")
	  public Object testdata()
	  {
		  Object data[][]= new Object[2][2];
		  data[0][0]="Ram";
		  data[0][1]=51;
		  data[1][0]="Sita";
		  data[1][1]=39;
		  return data;
	  }
	  @Test(dataProvider="Std_details")
	   public void testcase1(String name,int age) 
	   {
		  System.out.println(name+age);
	   }

}
