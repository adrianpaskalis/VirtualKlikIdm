package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import PageFactory.LoginWithPageFactory;

public class PbbPages extends LoginWithPageFactory {

	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[10]/div/a")
	public WebElement IconPBB;
	
	@FindBy (xpath="//*[@id=\"9ab3cce3-22e1-4f73-a228-cd5ef58b92bd\"]")
	public WebElement pilihPBBJakarta; 
	
	@FindBy (xpath="//*[@id=\"nomor_PBB\"]")
	public WebElement inputNomorPajak; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement logoPBBInput; 

	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[1]/div[1]/i")
	public WebElement btnCancel;
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/button")
	public WebElement listTahunPajak; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/div/div/input")
	public WebElement textInputTahunPajak; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[3]/div[2]/div/div/ul/li[2]/a")
	public WebElement pilihTahunPajak; 
	
	@FindBy (xpath="//*[@id=\"square_pbb-dki-jakarta\"]/div[2]/div/div/div/div[5]/div/div[2]/button")
	public WebElement buttonBayarPBBJakarta;
	
	
	
	
	
	public PbbPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void goToPBB() {
		try {
			waitElement(); 
			IconPBB.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pilihPBBJakarta()  { 
		try {
			waitElement(); 
			pilihPBBJakarta.click();
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputNomorPajak(String strNomorPajak) {
		try {
			waitElement();
			inputNomorPajak.sendKeys(strNomorPajak);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void logoPBBisDisplay() {
		try {	
				waitElementLong();
				boolean status = logoPBBInput.isDisplayed();
				Assert.assertTrue(status);
				Thread.sleep(5); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	public void btnCancelIsDisplay() {
		try {
			waitElementLong(); 
			boolean status = btnCancel.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public void clickListPajak() {
		try { 
			waitElement(); 
			listTahunPajak.click();
			Thread.sleep(0);
		} catch (InterruptedException e ) { 
			e.printStackTrace();
		}
	}
	
	public void textInputPajakIsDisplay() {
		try { 
			waitElement();
			boolean status = textInputTahunPajak.isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	public void pilihTahunPajak() {
		try { 
			waitElement(); 
			pilihTahunPajak.click();
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	public void clickBtnBayarPBB() {
		try { 
			waitElement(); 
			buttonBayarPBBJakarta.click();
			Thread.sleep(5);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
}
