package ExtentPackage;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportFile {
public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest Test;

@BeforeTest
//public static void setExtentReport() {
//	htmlReporter=new ExtentHtmlReporter(new File("./Extent.html"));
//	htmlReporter.config().setDocumentTitle("Automation Test");
//	htmlReporter.config().setReportName("ExtentReport");
//	htmlReporter.config().setTheme(Theme.DARK);
	public  void setupReport() {
        // ✅ Initialize ExtentHtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("TestReport.html");

        // ✅ Initialize ExtentReports and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
}
	@Test
	public  void test1() {
		Test= extent.createTest("MyFirtTest");
//		extentTest.pass("TestCase is Passed");
//		extentTest.fail("Testcase is failed");
		assert false : "Intentional Failure";
	}
	
	//@AfterTest
	public  void extentFlush() {
		
//		if(res.getStatus()==ITestResult.FAILURE)
//		{
//			extentTest.log(Status.FAIL, res.getThrowable());
//		}
//		else if (res.getStatus() == ITestResult.SUCCESS) {
//            extentTest.log(Status.PASS, "Test Passed");
//		}
		extent.flush();
	}
}


