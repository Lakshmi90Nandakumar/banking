package mavensample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups="regression")
	public void test_01()
	{
		Reporter.log("welcome",true);
		System.out.println("added");
	}
}
