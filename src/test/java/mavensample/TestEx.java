package mavensample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestEx {

	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("----test1 executed--");
		String URL=System.getProperty("url");
		String UNAME=System.getProperty("uname");
		String PWD=System.getProperty("pwd");
//		

		Reporter.log(URL,true);
		Reporter.log(UNAME,true);
		Reporter.log(PWD,true);
	
	
	}
	@Test(groups= {"smoke","regression"})
	public void test2() {
		System.out.println("-----test2 executed----");
	}
}
