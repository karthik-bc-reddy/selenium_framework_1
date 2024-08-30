package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample5 {

	@Test
	public void softAssterStrictCompare() {
		String expectedData = "raja";
		String actualData = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("strict comparision passed!!");
		sa.assertAll();
	}

	@Test
	public void containsLevelCompare() {
		String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparision passed!!");
		sa.assertAll();
	}

}
