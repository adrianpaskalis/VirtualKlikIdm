package PageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;

public class VirtualListener extends driverTest implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}
	
	 @Override
	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		VirtualTestReports.endTest();
		VirtualReports.getInstance().flush();
	}
	 @Override
	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		VirtualTestReports.startTest(result.getMethod().getMethodName());
	}
	
	 @Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		VirtualTestReports.getTest().log(Status.PASS, "Test passed");
	}

	 @Override
	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		VirtualTestReports.getTest().log(Status.FAIL, "Test Failed");
	}
	
	 @Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		VirtualTestReports.getTest().log(Status.SKIP, "Test Skipped");
	}
	
	 @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}
	
//	public void onTestFailure(ITestResult result) {
//		Log.info("*** Test execution " + result.getMethod().getMethodName() + "x failed...");
//		Log.info((result.getMethod().getMethodName() + " failed!"));
//
//		ITestContext context = result.getTestContext();
//		WebDriver driver = (WebDriver) context.getAttribute("driver");
//
//		String targetLocation = null;
//
//		String testClassName = getTestClassName(result.getInstanceName()).trim();
//		String timeStamp = Util.getCurrentTimeStamp(); // get timestamp
//		String testMethodName = result.getName().toString().trim();
//		String screenShotName = testMethodName + timeStamp + ".png";
//		String fileSeperator = System.getProperty("file.separator");
//		String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
//				+ "screenshots";
//		log.info("Screen shots reports path - " + reportsPath);
//		try {
//			File file = new File(reportsPath + fileSeperator + testClassName); // Set
//																				// screenshots
//																				// folder
//			if (!file.exists()) {
//				if (file.mkdirs()) {
//					log.info("Directory: " + file.getAbsolutePath() + " is created!");
//				} else {
//					log.info("Failed to create directory: " + file.getAbsolutePath());
//				}
//
//			}
//
//			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			targetLocation = reportsPath + fileSeperator + testClassName + fileSeperator + screenShotName;// define
//																											// location
//			File targetFile = new File(targetLocation);
//			log.info("Screen shot file location - " + screenshotFile.getAbsolutePath());
//			log.info("Target File location - " + targetFile.getAbsolutePath());
//			FileHandler.copy(screenshotFile, targetFile);
//
//		} catch (FileNotFoundException e) {
//			log.info("File not found exception occurred while taking screenshot " + e.getMessage());
//		} catch (Exception e) {
//			log.info("An exception occurred while taking screenshot " + e.getCause());
//		}
//
//		// attach screenshots to report
//		try {
//			ExtentTestManager.getTest().fail("Screenshot",
//					MediaEntityBuilder.createScreenCaptureFromPath(targetLocation).build());
//		} catch (IOException e) {
//			log.info("An exception occured while taking screenshot " + e.getCause());
//		}
//		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
//	}
}
