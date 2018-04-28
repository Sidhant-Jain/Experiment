package test;

import org.junit.Assert;
import org.junit.Test;
import hackerrank.ElectronicShop;

public class MyTestCases {

	@Test
	public void testingElectric() {
		int receivedOutput = ElectronicShop.electricItems(10, 2, 3);
		int expectedOutput = 9;
		Assert.assertEquals(expectedOutput, receivedOutput);
	}
	
	@Test
	public void testingElectricTest() {
		int receivedOutput = ElectronicShop.electricItems(5, 1, 1);
		int expectedOutput = -1;
		Assert.assertEquals(expectedOutput, receivedOutput);
	}

}
