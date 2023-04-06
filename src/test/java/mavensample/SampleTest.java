package mavensample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups="smoke")
	public void test_01()
	{
		Reporter.log("welcome",true);
		System.out.println("added again");

		System.out.println("additional");
		System.out.println("added");
				System.out.println("added");

		
	}
}
