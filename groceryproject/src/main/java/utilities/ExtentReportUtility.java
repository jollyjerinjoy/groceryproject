package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("7RMart  Project");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Aswani");
		return extentReports;
	}

}


//We use Extent Report Utility to create and configure a single ExtentReports instance, 
//which is consumed by a TestNG listener to log test execution status 
//and generate an HTML report after execution.
//
//•	Added AventStack Extent dependency in pom.xml
//•	Used to generate HTML test execution reports
//•	Created a utility class to configure the report
//•	Set report path, report name, and system details
//•	Utility method returns ExtentReports object
//•	TestNG Listener uses this object
//•	Listener logs:
//•	PASS
//•	FAIL
//•	SKIP
//•	extent.flush() generates the final report
//•	Report is created under path

