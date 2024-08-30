package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample3 {

	@Test
	public void createUser() {
		System.out.println("user created");
	}

	@Test(invocationCount = 0)
	public void modifyUser() {
		System.out.println("user modified");
	}

	@Ignore
	@Test
	public void deleteUser() {
		System.out.println("user deleted");
	}
}
