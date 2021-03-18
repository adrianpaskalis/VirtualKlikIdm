package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;

public class HomePageVirtual extends LoginWithPageFactory {
	public WebDriver driver; 
	
//	By logoIdm 			= By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]");
//	By downloadApp	 	= By.id("downloadApp"); 
//	By linkFacebook 	= By.xpath("//*[@id=\"follow_us\"]/a[1]");
//	By linkInstagram 	= By.xpath("//*[@id=\"follow_us\"]/a[2]"); 
//	By layananPelanggan = By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[1]/div[2]/div[1]");
//	By daftarTrxHome 	= By.id("itemStatus");
//	By itemSaldoHome 	= By.id("itemSaldo"); 
//	By profileUser		= By.id("dropdownUser"); 
//	
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]")
	
	//	
	 public WebElement logoIdm; 
	 
	 @FindBy(id="downloadApp")
	 public WebElement downloadApp ; 
	 
	 @FindBy(xpath="//*[@id=\"follow_us\"]/a[1]")
	 public WebElement linkFacebook;  
	 
	 @FindBy(xpath="//*[@id=\"follow_us\"]/a[2]") 

	 public WebElement linkInstagram;  
	 
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[1]/div[2]/div[1]") 
	 public WebElement layananPelanggan; 
	 
	 @FindBy(xpath="//*[@id=\"itemStatus\"]")
	 public WebElement daftarTrxHome; 
	 
	 @FindBy(id="itemSaldo")
	 public WebElement itemSaldoHome;  
	 
	 @FindBy(id="dropdownUser")
	 public WebElement profileUser;
	 
	 @FindBy(name="search")
	 public WebElement search;

	 @FindBy(xpath="//*[@id=\"site-content\"]/div[1]")
	 public WebElement bannerVirtual; 
	 
	 
	public HomePageVirtual(WebDriver driver) {
		super(driver);
	}
	
	
	public  void  logoIsDisplay() throws NoSuchElementException{
		try { 
			
			waitElement();
			Boolean status = logoIdm.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	} 
	
	public  void  downloadAppIsDisplay() throws NoSuchElementException{
		try { 
			
			waitElement();
			Boolean status = downloadApp.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
		
	}
		
		
	public void facebookIsDisplay() throws NoSuchElementException{
			try {
				waitElement();
				Boolean status = linkFacebook.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			} 
	} 

	public void instagramIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = linkInstagram.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	}  
	
	public void layananIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = layananPelanggan.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	} 
	
	public void daftarTrxIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = daftarTrxHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	}  
	
	public void itemSaldoIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = itemSaldoHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	}  

	public void profileIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = profileUser.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	} 
	

	public void searchIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = search.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	} 
	
	public void bannerIsDisplay() throws NoSuchElementException {
		try { 
			waitElement();
			Boolean status = bannerVirtual.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		} 
	
	}
	
	
	
//	public String getProfileUsername() {
//		return driver.findElement(profileUser).getText();
//	}
} 



