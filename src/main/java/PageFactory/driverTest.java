package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class driverTest {  
	public String testUrl ;
	public WebDriver driver;
	
	@BeforeSuite
	public void startApps() {
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver90.exe");	
		testUrl = "https://virtual.klikindomaret.com/";
		driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//maximize window
		driver.manage().window().maximize();
		// driver.navigate().to(testUrl);
		driver.get(testUrl); 
		} 
	
	
	@AfterSuite
	public void closeApp() {
		driver.quit();
	}


}
