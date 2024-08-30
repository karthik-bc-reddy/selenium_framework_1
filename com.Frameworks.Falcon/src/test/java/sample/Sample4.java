package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {

	@Test
	public void hardAssertStrictCompare() {
		String expectedData = "raja";
		String actualData = "raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("Strict comparision passed!!");
	}

	@Test
	public void containsLevelCompare() {
		String expectedData = "raja";
		String actualData = "maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparision passed!!");
	}
}
