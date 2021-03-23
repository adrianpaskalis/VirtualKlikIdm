package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageFactory.LoginWithPageFactory;

public class PulsaPage extends LoginWithPageFactory {
	
	
	@FindBy (xpath="//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[1]/div/a")
	public WebElement IconPulsa; 
	
	@FindBy (xpath="//*[@id=\"fde94763-8c56-45a3-abc9-6efe422f321c\"]")
	public WebElement CategoryPulsa; 
	
	@FindBy (xpath="//*[@id=\"nomor_pulsa\"]")
	public WebElement inputNomorPulsa;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[1]/div[1]")
	public WebElement iconProviderPulsa;
	
	@FindBy (xpath="//*[@id=\"ddl_nomor_pulsa\"]")
	public WebElement pilihDenomPulsa; 
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[3]/div[2]/div/ul/li[4]")
	public WebElement pilih25k;
	
	@FindBy (xpath="//*[@id=\"square_fde94763-8c56-45a3-abc9-6efe422f321c\"]/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
	public WebElement buttonBayarPulsa;

	public PulsaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	
	public void goToPulsa() throws InterruptedException{
		try { 
		
			waitElement();
			IconPulsa.click();
		
		} catch (NoSuchElementException e) {
		// TODO: handle exception
		} 
	
	} 
	
	public void goToCategoryPulsa() throws NoSuchElementException{
		try {
			waitElement();
			CategoryPulsa.click();
		} catch (NoSuchElementException e) {
			
		}
	}
	
	public void inputNomorPulsa(String strInquiryPulsa) throws NoSuchElementException{
		try {
			waitElement(); 
			inputNomorPulsa.sendKeys(strInquiryPulsa);
			inputNomorPulsa.sendKeys(Keys.ENTER);
			waitElementLong();	
			} catch (NoSuchElementException e) {
			
		}
	}
	
	
	
	public void pilihDenomPulsa() throws NoSuchElementException{
		try {
			waitElementLong();
			pilihDenomPulsa.click(); 
			pilih25k.click();
			System.out.println("pilih denom BISA");
			

		}catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("pilih denom gak bisa");

		}
	}
	public void pilihPulsa25() throws NoSuchElementException{
		try {
			waitElement();
			pilih25k.click();
		}catch (NoSuchElementException e) {
		
			
		}
	}
	
	public void clickButtonBayarPulsa() throws NoSuchElementException {
		try {
			waitElement();
			buttonBayarPulsa.click();
		} catch (NoSuchElementException e) {
			
		}
	}
	
	
	
}
