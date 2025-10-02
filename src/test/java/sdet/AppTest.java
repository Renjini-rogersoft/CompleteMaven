package sdet;



import org.testng.Assert;
import org.testng.annotations.Test;
import javaPack.App;

public class AppTest {
  @Test
  public void testlogin1() 
  {
	 App obj=new App();
	 Assert.assertEquals(0,obj.userLogin("abc","abc123"));
	 
  }
  
  @Test
  public void testlogin2() 
  {
	  App obj=new App();
		 Assert.assertEquals(1,obj.userLogin("abc","abc@123"));
  }
}
