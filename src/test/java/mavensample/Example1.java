package mavensample;

import org.testng.annotations.Test;

public class Example1 {

	@Test(groups="smoke")
	public static void script1() {
		System.out.println("Script 1");

	}
	
	@Test(groups="regression")
	public static void script2() {
		System.out.println("Script 2");

	}

}
