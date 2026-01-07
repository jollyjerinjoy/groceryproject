package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("7RMart  Projects");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organizations", "Obsquras");
		extentReports.setSystemInfo("Name", "Jolly");
		extentReports.setSystemInfo("Name", "Greesma");
		return extentReports;
	}

}
