package genericUtilityOrLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("from this" + methodname + " execution starts!!");
	}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname + " execution Successful!!");
	}

	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();

		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\" + methodname + ".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname + " execution skips!!");
	}

	

}
