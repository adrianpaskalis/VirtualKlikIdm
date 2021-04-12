package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;

public class DaftarTrxPage extends LoginWithPageFactory {
	
	@FindBy (xpath="/html/body/div[23]/div/div[5]/a[3]")
	public WebElement introNext; 
	
	
	@FindBy (xpath="/html/body/div[23]/div/div[5]/a[1]")
	public WebElement introClose;

	@FindBy(xpath="//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]")
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
	 
	 @FindBy (xpath="//*[@id=\"siteHeader\"]/div[2]/div/div/ul/li[1]/a")
	 public WebElement iconRetail; 
	 
	 @FindBy(xpath ="//*[@id=\"siteHeader\"]/div[2]/div/div/ul/li[2]/a")
	 public WebElement iconVirtual; 
	 
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[2]/div/div/ul/li[3]/a")
	 public WebElement iconTravel; 
	 
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[2]/div/div/ul/li[4]/a")
	 public WebElement iconFood; 
	 
	 @FindBy(xpath="//*[@id=\"siteHeader\"]/div[2]/div/div/ul/li[5]/a")
	 public WebElement iconTiket;  
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[1]/button")
	 public WebElement btnDaftarTrxVirtual; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[1]/a[1]/button")
	 public WebElement btnDaftarTrxRetail; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[1]/a[2]/button")
	 public WebElement btnDaftarTrxTravel; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[1]/a[3]/button")
	 public WebElement btnDaftarTrxFood; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[1]/a[4]/button")
	 public WebElement btnDaftarTrxTiket; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[1]/div[2]/div/div")
	 public WebElement filterDaftarTrx; 
	
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[2]")
	 public WebElement listSODaftarTrx; 
	 
	 @FindBy (xpath="//*[@id=\"site-content\"]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div[2]")
	 public WebElement detailSOdaftarTrx; 
	 
	 @FindBy (xpath="//*[@id=\"myTransactionModal-AEP383PCA\"]/div")
	 public WebElement popUpDaftarTrx; 
	 
	public DaftarTrxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void introNextIsDisplay() {
		try {
			waitElement();
			introNext.click();
			Thread.sleep(10);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void introCloseIsDisplay() {
		try {
			waitElement();
			introClose.click();
			Thread.sleep(10);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	public  void  logoIsDisplay() throws NoSuchElementException{
		try { 
			
			waitElement();
			Boolean status = logoIdm.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		
	} 
	
	public  void  downloadAppIsDisplay() throws NoSuchElementException{
		try { 
			
			waitElement();
			Boolean status = downloadApp.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception 
			e.printStackTrace();
		} 
		
	}
		
		
	public void facebookIsDisplay() throws NoSuchElementException{
			try {
				waitElement();
				Boolean status = linkFacebook.isDisplayed();
				Assert.assertTrue(status);
				
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
	} 

	public void instagramIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = linkInstagram.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}  
	
	public void layananIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = layananPelanggan.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void daftarTrxIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = daftarTrxHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}  
	
	public void itemSaldoIsDisplay() throws NoSuchElementException{
		try { 
			waitElement();
			Boolean status = itemSaldoHome.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}  

	public void profileIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = profileUser.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void iconRetailIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = iconRetail.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	
	public void iconVirtualIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = iconVirtual.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void iconTravelIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = iconTravel.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void iconFoodIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = iconFood.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void iconTiketIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = iconTiket.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void btnDaftarTrxVirtualIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = btnDaftarTrxVirtual.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void btnDaftarTrxRetailIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = btnDaftarTrxRetail.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	public void bbtnDaftarTrxTravelIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = btnDaftarTrxTravel.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	public void btnDaftarTrxFoodIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = btnDaftarTrxFood.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	public void btnDaftarTrxTiketIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = btnDaftarTrxTiket.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void filterDaftarTrxIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			Boolean status = filterDaftarTrx.isDisplayed();
			Assert.assertTrue(status);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void detailSOdaftarTrxIsDisplay() throws NoSuchElementException{

		try { 
			waitElement();
			detailSOdaftarTrx.click();
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	} 
	
	public void popUpDaftarTrxIsDisplay() {

		try { 
			waitElement();
			Boolean status = popUpDaftarTrx.isDisplayed();
			Assert.assertTrue(status);
			System.out.println("pop up ketemu");
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace(); 
			System.out.println("pop up ga ketemu");
		} 
	} 

}
