package mavensample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups="smoke")
	public void test_01()
	{
		Reporter.log("welcome",true);
		System.out.println("added again");
<<<<<<< HEAD
		System.out.println("additional");
=======
		System.out.println("added");
				System.out.println("added");

		
>>>>>>> branch 'branchbank' of https://github.com/Lakshmi90Nandakumar/banking.git
	}
}
