package retry;

import org.testng.IRetryAnalyzer;//testng provided interface
import org.testng.ITestResult; //testng provided interface

public class Retry implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 2; // retry count

	public boolean retry(ITestResult result) { // invoke when testcase fails

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
}

//Uses ITestRetryAnalyzer.
//Automatically re-executes failed test cases.
//Helps handle flaky test failures.
